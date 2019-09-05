import java.util.*;
class book
{
  String name,author;
  double price;
  int num_pages;
  book()
  {
    name=null;
    author=null;
    price=0.0;
    num_pages=0;
   }
    void setdata()
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the name of the book:");
       name=s.next();
       System.out.println("Enter the name of the author:");
       author=s.next();
       System.out.println("Enter the price of the book:");
       price=s.nextFloat();
       System.out.println("Enter the num of pages the book:");
       num_pages=s.nextInt();
     }
     public String toString()
     {
       String b=("Name:"+name+"\nAuthor Name:"+author+"\nPrice:"+price+"\nNumber of Pages:"+num_pages);
       return b;
      }
       void getdata()
        { 
           String str=toString();
           System.out.println(str);

    } 
}
class bookmain
{ 
   public static void main(String args[])
    { 
      Scanner in=new Scanner(System.in);
 
      
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the numbers of books:");
       int n=s.nextInt();
       book b1[]=new book[n];
       for(int i=0;i<n;i++)
       {
          b1[i]=new book();
        }
        for(int i=0;i<n;i++)
        {  
           System.out.print("\nEnter the details of the"+(i+1));
           if((i+1)==1)
             System.out.println("st book:");
           else if((i+1)==2)
             System.out.println("nd book:");
           else if((i+1)==3)
             System.out.println("rd book:");
           else 
              System.out.println("th book:");    
            b1[i].setdata();
         }
         for(int i=0;i<n;i++)
         {
         System.out.print("\n\nBook"+(i+1)+" details:");
         System.out.println("...............................");
         b1[i].getdata();
         }
    
     }

}

