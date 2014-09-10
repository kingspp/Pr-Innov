

#include<iostream.h>
#include<conio.h>

int fact(int x)
{
	int res=1;
	for(int i=x;i>1;i--)
		res*=i;
	return res;
}

void main()
{
	int n,k,row=7;
	int pt=1;
	clrscr();
	for(int s=0;s<row;s++)
	{
		for(k=0;k<=s;k++)
		{
		pt=fact(s)/(fact(k)*(fact(s-k)));
		cout<<pt<<" ";
		}
	cout<<"\n";
	}
	getch();
}
