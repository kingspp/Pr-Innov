/*
Created on 7-09-2014
@Author : Prathyush

Matrix : Dynamic MAtrix with Dynamic Input:
for ex: Consider 2x2 Matrix:
I/p: 1	2
     3	4
    
o/p: 1	2     3
     3	4     7
     
     4	6     20
*/

#include<stdio.h>
#include<conio.h>

int row,col;
int i,j,k;
int mat[100][100];
int r=0,c=0;

void getIn()
{
printf("Enter the elements of the Matrix: \n");
for(i=0;i<row;i++)
for(j=0;j<row;j++)
scanf("%d",&mat[i][j]);
}


void printMat()
{
printf("\nThe Final Matrix is: \n");
for(i=0;i<=row;i++)
{
	for(j=0;j<=col;j++)
	{
	if(j==col)
	printf("\t");
		printf("\t%d",mat[i][j]);

	}
	if(i==row-1)
	printf("\n");
	printf("\n");
}
printf("\n");
}

void init()
{
for(i=0;i<100;i++)
{
	for(j=0;j<100;j++)
	{
		mat[i][j]=' ';
	}
}
}


void cal()
{
for(i=0;i<=row;i++)
{
	for(j=0;j<=col;j++){
	if(j==col){
	for(k=0;k<col;k++){
	mat[i][j]+=mat[i][k];
	//printf("%d\n",mat[i][j]);
	}
	mat[i][j]=mat[i][j]-32;
	}

	if(i==col){
	for(k=0;k<col;k++){
	mat[i][j]+=mat[k][j];
	//printf("%d\n", mat[i][j]);
	}
	mat[i][j]=mat[i][j]-32;
	}
	}
}

j=row;
for(i=0;i<row;i++)
r+=mat[i][j];
j=col;
for(i=0;i<row;i++)
c+=mat[j][i];
mat[j][j]=r+c;
}


void main()
{


clrscr();

init();
printf("Enter the no of Rows: ");
scanf("%d",&row);
printf("Enter the no of Columns: ");
scanf("%d",&col);


getIn();

cal();
printMat();





getch();

}
