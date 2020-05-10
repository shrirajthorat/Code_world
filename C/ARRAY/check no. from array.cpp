#include <stdio.h>

int main()
{
	int a[5];
	int n,i,flag;
	printf("enter 5 elelments");
	for( i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the no. to check");
	scanf("%d",&n);
	
	for( i=0;i<5;i++)
	{
		if(a[i]==n)
		{
			flag=1;
		}
	}
	if(flag==1)
	{
			printf("the no. is present in array");
	}else
	{
		printf("no. is not present");
	}


   return 0;
}

