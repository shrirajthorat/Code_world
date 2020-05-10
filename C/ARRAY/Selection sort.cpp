// 1 st method

#include <stdio.h>

/*int main()
{
	int a[5];
	int i,j,n=5;
	printf("enter 5 elelments\n");
	for( i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	
	for( i=0;i<5;i++)
	{
		printf("\n%d",a[i]);
	}

	return 0;
}*/

// 2ne method with d help of min

int main()
{
	int a[5];
	int i,j,n=5,min;
		printf("enter 5 elelments\n");
	for( i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[min]>a[j])
			min=j;
		}
		if(min!=i)
		{
			int t=a[min];
			a[min]=a[i];
			a[i]=t;
		}
	}	
		
	for( i=0;i<5;i++)
	{
		printf("\n%d",a[i]);
	}

		
}

