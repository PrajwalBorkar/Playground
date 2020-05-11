#include<stdio.h>
void pattern(int);
int main()
{
  int n;
  scanf("%d",&n);
  pattern(n);
  return 0;
}
void pattern(int n)
{
  int i,j,k=1,l=2,h;
  int rest=n*(n+1)+1,rn=0;

  for(i=n;i>0;i--)
    {
      if(i<n)
        {
          for(h=1;h<=l;h++)
            printf("-");
          l=l+2;
        }
      for(j=1;j<=i;j++)
        {
          printf("%d",k);
          k++;           
          printf("*");
        }

      rest=rest-i;
      rn=rest;

      for(int p=1;p<=i;p++)
        {      
          printf("%d",rn);
          rn++;
          if(p!=i)
            printf("*");

        }
      printf("\n");  
    }
}
