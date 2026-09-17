#include<stdio.h>;
int main( )
{
int n = 4;
int at[ ] = {1, 5, 9, 10}; // Arrival Times
int bt[ ] = {4, 3, 5, 2}; // Burst Times
int ct[4], tat[4], wt[4];
int cpu_idle = 0;
int current_time = 0;
printf("\nProcess\t AT\t BT\t CT\t TAT\t WT\n");
for(int i = 0; i <n; i++)
{
if(current_time< at[i])
{
cpu_idle += (at[i] - current_time);
current_time = at[i];
}
current_time += bt[i];
ct[i] = current_time;
tat[i] = ct[i] - at[i];
wt[i] = tat[i] - bt[i];
}
for(int i = 0; i<n; i++)
{
printf("P%d\t %d\t %d\t %d\t %d\t %d\n",i+1, at[i], bt[i], ct[i], tat[i], wt[i]);
}
printf("\nTotal CPU Idle Time = %d units\n", cpu_idle);
printf("\nAverage Waiting Time = %.2f",(wt[0]+wt[1]+wt[2]+wt[3])/4.0);
printf("\nAverage Turnaround Time = %.2f",(tat[0]+tat[1]+tat[2]+tat[3])/4.0);
return 0;
}