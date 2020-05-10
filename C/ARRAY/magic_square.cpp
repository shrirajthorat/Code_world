#include<stdio.h>

int main()
{
	int a1[4][4];
	int i,j;
	printf("enter values of array1 :  ");
	
	for(i=0;i<=3;i++)
	{
		for(j=0;j<=3;j++)
		{
			scanf("%d",&a1[i][j]);
		}
	}
     int row=0,col=0,diag=0;
	for(i=0;i<=3;i++)
	{
		row=0;
		for(j=0;j<=3;j++)
		{
			row=row+a1[i][j];
		}
	}
	for(i=0;i<=3;i++)
	{
		col=0;
		for(j=0;j<=3;j++)
		{
			col=col+a1[j][i];
		}
	}
	for(i=0;i<=3;i++)
	{
		diag=0;
		for(j=0;j<=3;j++)
		{
			if(i==j)
			{
				diag=diag+a1[i][j];
			}
		}
	}	
	if(row==col==diag)
	{
		printf("Its magic!!!");
	}else
	{
		printf("waste of time");
	}
}
