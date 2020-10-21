/*#include<iostream>
using namespace std;

int arr[]={1,2,3,4,5,6,7,8,9};
int e,res;
int binarySearch(int e)
{
	int l=0,r=8,m;
	while(l<r)
	{
		m=(l+r)/2;
		if(arr[m]<e)
		{
			l=m+1;
		}else if(arr[m]>e)
		{
			r=m-1;
		}else
		{
			return 1;
		}
	}
	return 0;
}

int main()
{
	cout<<"Enter elenment to serach \n";
	cin>>e;
	res=binarySearch(e);
	if(res==1)
	{
		cout<<"No. found";
	}else
		cout<<"No. not found ";

}
*/