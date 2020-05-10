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
     int row=0,col=0,r[3];
	for(i=0;i<=3;i++)
	{
		row=0;
		for(j=0;j<=3;j++)
		{
			row=row+a1[i][j];
			r[i]=row;
		}
	}
	for(i=0;i<4;i++)
	printf("  %d",r[i]);
	printf("\n");
	for(i=0;i<=3;i++)
	{
		col=0;
		for(j=0;j<=3;j++)
		{
			col=col+a1[j][i];
			r[i]=col;
		}
	}
	for(i=0;i<4;i++)
	printf("  %d",r[i]);
	
}
