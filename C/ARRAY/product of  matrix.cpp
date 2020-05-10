#include<stdio.h>

int main()
{
	int a1[3][3],a2[3][3];
	int i,j;
	printf("enter values of array1 :  ");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			scanf("%d",&a1[i][j]);
		}
	}
		printf("enter values of array2 :  ");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			scanf("%d",&a2[i][j]);
		}
	}
	printf("\n Product is : ");
	int a3[3][3];
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			a3[i][j]=a1[i][j]*a2[i][j];
			printf("  %d",a3[i][j]);
		}
		printf("\n");
	}
	
}
