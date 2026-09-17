#include<stdio.h>
int main() {
	int n=5;
	int at[]={0,2,4,6,8};
	int bt[]={3,6,4,5,2};
	int ct[5],tat[5],wt[5];
	int completed[5]={0};
	int current_time=0;
	int completed_count=0;
	float total_wt=0;
	float total_tat=0;
	printf("\n STF Scheduling (Non-Premitive)\n");
	printf("\n Process \t AT \t Bt\t CT\t TAT\t WT \n");
	while (completed_count <n)
	{
		int index=-1;
		int min_bt=9999;
		for(int i=0;i<n;i++){
			if(at[i])<=current-time && completed[i]==0){
				if(b[i]<min_bt){
					min_bt=bt[i];
					index=i;
				}
			}
		}
		if(index==-1){
			current_time++;
		}
		else{
			current_time+=bt[index];
			ct[index]=current_time;
			tat[index]=ct[index]-at[index];
			wt[index]=tat[index]-bt[index];
			completed[index]=1;
			computed_count++;
			
			}
		}
	}
}