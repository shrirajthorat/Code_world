#include <stdio.h>

int main()
{
	int a[5];
	int i,j,n=5;
	printf("enter 5 elelments\n");
	for( i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(j=0;j<n-1;j++)
	{
		for(i=0;i<n-1-j;i++)
		{
			if(a[i]>a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
	}
	
	for( i=0;i<5;i++)
	{
		printf("%d \n",a[i]);
	}

	return 0;
}
