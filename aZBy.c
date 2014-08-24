#include<stdio.h>
#include<conio.h>

void main()
{
  int i,len,u,l,space=32;
  char in[100];
  clrscr();
  gets(in); // used to input for a string. It accepts space character
  for(i=0;in[i]!='\0';i++); // count the length of the string
  len=i;
  
  for(i=0;i<len;i++)
  {
    if(in[i]>=65 && in[i]<=90 || in[i]==32) // Uppercase
    {
      if(in[i]==32)
      {
        printf("%c",space);
      }
      else
      {
        u='Z'-in[i];
        printf("%c",'a'+u);
      } // end of if
    }// end of if
    else if(in[i]>=91 && in[i]<=122) // Lowercase
    {
      l='z'-in[i];
      printf("%c",'A'+l);
    }// end of else
  }// end of for
  getch();
}
