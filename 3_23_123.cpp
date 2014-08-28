//Created on 28-Aug-2014
//@author: prathyush

#include<iostream.h>
#include<conio.h>

void main()
{

int num,i,j;
clrscr();
cout<<"Enter the Starting Number:\n";
cin>>num;
cout<<"\n";

j=num;
while(j>0)
{
for(i=j;i<=num;i++)
{
cout<<i;
}
cout<<"\n";
j--;
}


getch();

}
