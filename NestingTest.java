class Nesting
{
  int m,n;
  Nesting(int x,int y)
  {
   m=x;
   n=y;
  }
   int largest()
   {  
     if(m>=n)
      {
       return(m);
      }
     else
      {
       return(n);
      }
    }
 void display()
   {
    int large= largest();
    System.out.println("Largest in m or n"+" "+ large);
   }
}
class NestingTest
{
  public static void main(String[] args)
  {
   Nesting nest = new Nesting(50,100);
   nest.display();
  }
}

    
 
