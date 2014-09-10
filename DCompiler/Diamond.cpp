/*
Created on Aug 24, 2014

@author: Prathyush
*/

/*
This program print the Diamond Pattern.
Change the MAX variable to suit your needs.
*/

#include<iostream.h>
#include<conio.h>

void main()
{
	static int MAX=6;
	int i,j,k;
	clrscr();
	//top
	for(i=MAX;i>0;i--)
	{
		for(k=0;k<i;k++)
			cout<<"   ";
		for(j=i;j<=MAX-i;j++)
			cout<<" * ";
		cout<<"\n";
	}
	//bottom
	for(i=0;i<MAX;i++)
	{
		for(k=0;k<i;k++)
			cout<<"   ";
		for(j=i;j<=MAX-i;j++)
			cout<<" * ";
		cout<<"\n";
	}
	getch();
}
