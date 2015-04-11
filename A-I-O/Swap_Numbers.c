/*
 * Swap.c
 *
 *  Created on: Aug 21, 2014
 *      Author: Prathyush
 *  Description: This program demonstrates the ways of swapping the numbers
 *  There are 4 ways:
 *  1. Using Temporary Variable
 *  2. Using Arithmetic Operations
 *  3. Using Logical Operations
 *  4. Using Pointers
 */

#include <stdio.h>
#include <time.h>

int main()
{
	int a,b,t,ch;
	int *x,*y;
	time_t start,end;
	time (&start);
	printf("Swap two variables using:\n");
	printf("1.Temporary Variable\n");
	printf("2.Arithmetic Operator\n");
	printf("3.Logical Operator\n");
	printf("4.Pointers\n");
	printf("\nEnter two variables: ");
	scanf("%d",&a);
	scanf("%d",&b);
	printf("\nEnter your Choice: ");
	scanf("%d",&ch);
	switch(ch)
	{
	case 1:
		printf("1. Temporary variables\n");
		t=a; a=b; b=t;
		printf("a= % d and b = %d\n",a,b);
	break;

	case 2:
		printf("2. Arithmetic Operators\n");
		a=a+b;
		b=a-b;
		a=a-b;
		printf("a= % d and b = %d\n",a,b);
	break;

	case 3:
		printf("3. Logical Operators\n");
		a=a^b;
		b=a^b;
		a=a^b;
		printf("a= % d and b = %d\n",a,b);
	break;
	
	case 4:
		printf("4. Pointers\n");
		x=&a;
		y=&b;
		printf("a= % d and b = %d\n",*y,*x);
	break;
	}
	time (&end);
	double dif = difftime (end,start);
	printf ("Elasped time is %.2lf seconds.", dif );
	return 0;
}
