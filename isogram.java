import java.io.*;
import java.util.*;
  public class isogram{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.nextLine();
      int ans=0;
      for(int i=0;i<str.length();i++)
        {
          for(int j=0;j<str.length;j++)
            {
              if(str.charAt(i)==str.charAt(j))
              {
              ans=0;
              }
              else
              {
              ans=1;
              }
            }
        }
      if(ans==1)
      {
      System.out.println("The String is isomorphic");
      }
      else if(ans==0)
      {
      System.out.println("The String is not isomorphic");
      }
   }
 }  
