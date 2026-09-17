#include<stdio.h>
int main()
{
	int bt[]={10,1,2,1,5};
	int rem[]={10,1,2,1,5};
	int wt[5],rt[5],tat[5];
	int time=0,completed=0,i;
	float avgwt=0,avgrt=0,avgtat=0;
	while(completed<5)
	{
		for(i=0;i<5;i++)
		{
			if(rem[i]>0)
			{
				if(rem[i]==bt[i])
				rt[i]=time;
				if(rem[i]>1)
				{
					rem[i]--;
					time++;
				}
				else
				{
					time++;
					rem[i]=0;
					tat[i]=time;
					completed++;
				}
			}
		}
	}
	for(i=0;i<5;i++)
	{
		wt[i]=tat[i]-bt[i];
		avgwt+=wt[i];
		avgrt+=rt[i];
		avgtat+=tat[i];
	}
	printf("Process\tBT\tWT\tRT\tTAT\n");
	for(i=0;i<5;i++)
	{
		printf("P%d\t%d\t%d\t%d\t%d\n",i+1,bt[i],wt[i],rt[i],tat[i]);
	}
    printf("average waiting time=%.2f\n",avgwt/5);
    printf("average response time=%.2f\n",avgrt/5);
    printf("average turn around time=%.2f\n",avgtat/5);
    return 0;
}
