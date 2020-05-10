#include<stdio.h>

int main()
{
	int a[]={10,20,30,40,50,60,70,80,90,100};
	int flag,l=0,u=9,m,n;
	
	
	printf("enter the no. to search");
	scanf("%d",&n);
	
	while(l<=u)
	{
		m=(l+u)/2;
		
		if(n>a[m])
		{
			l=m+1;
		}else if(n<a[m])
		{
			u=m-1;
		}else
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
			printf("no. found");
	}else
	{
		printf("no not found");
	}
}
