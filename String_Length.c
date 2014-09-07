/*
Created on 7-09-2014
@Author: Prathyush

This Program calculates the space without using any built in functions

Built in function: <string.h> : strlen(arr_name);
*/

#include<stdio.h>
#include<conio.h>

void main()
{
  int i=0,j=0;
  char str[100];
  clrscr();
  printf("Enter the String: \n");
  while(i<101)
  {
    str[i]='\0';
    i++;
  }
  gets(str);
  i=0;
  while(str[i]!='\0')
  {
    if(str[i]==' ')
      j++;
    i++;
  }
  printf("Length of the String including spaces: %d\n",i);
  printf("Length of the String excluding spaces: %d\n",i-j);
  getch();
}
