/*
Date: Sep 10 , 2014
@Author: Prathyush SP

Description: Pascals Triangle. 
The pattern is defined by "row variable"
row=7
		   1                                                                                                                                                                                                                                                      
		 1   1                                                                                                                                                                                                                                                    
	       1   2    1                                                                                                                                                                                                                                                  
	     1   3    3    1                                                                                                                                                                                                                                                
	   1   4    6    4   1                                                                                                                                                                                                                                              
	 1   5   10   10   5   1   
*/

#include<iostream.h>
#include<conio.h>

int fact(int x)
{
	int res=1;
	for(int i=x;i>1;i--)
		res*=i;
	return res;
}

int main()
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
	return 0;
}
