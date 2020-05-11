#include <iostream>
using namespace std;
struct book
{
int price;
}m={100};
 int main()
{
    book & disp();
    disp()=200;
    cout << m.price;
    return 0;
}
  book & disp()
{
    return m;
}
