#include <iostream>
using namespace std;
void sum(int a,int b,int c,int d=0,int e=0)
{
 int sum=a+b+c+d+e;
 cout << sum;
}
int main()
{

    int a,b,c,d,e;
    cout << "enetr value" << endl;
    cin >> a >> b >> c >> d >> e;
    sum(a,b,c,d,e);
    return 0;
}

