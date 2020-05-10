#include<stdio.h>

int main()
{
	int a[]={0,3,7,1,22,3,0,6,8,9,0},i,j,n=11,t;
	
	for(i=0;i<n;i++)
	{
		if(a[i]==0)
		{
			t=a[i];
			for(j=i;j>0;j--)
			{
				a[j]=a[j-1];
			}
		}
	}
	
	for(i=0;i<n;i++)
	printf("  %d",a[i]);
}

	
