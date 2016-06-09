import java.io.*;
class Lock{
 static int arr[]=new int[101];
 public static void main(String args[])throws Exception{
    for(int i=1;i<=5;i++)
     {
       for(int j=i;j<=5;j=j+i)
        {
          if(arr[j]==0)
           arr[j]=1;
          else if(arr[j]==1)
           arr[j]=0;
        }
     }
  for(int i=1;i<=100;i++)
   {
     if(arr[i]==1)
      {
        System.out.println("Lock  "+i+"opened");
      }
   }
 
  }
}
  