import java.util.*;
class greatest_3
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter any 3 numbers:");
   int a= in.nextInt();
   int b= in.nextInt();
   int c=in.nextInt();
   if(a==b||b==c||c==a)
   {
       System.out.println("Enter valid numbers");
   }
   else
   {
   int big=a;
   if(b>big) big=b;
   if(c>big) big=c;
   System.out.println("Greatest of"+a+"&"+b+"&"+c+"is"+big);
   }
 }
}