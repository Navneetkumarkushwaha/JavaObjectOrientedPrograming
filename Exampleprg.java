class Exampleprg
{
   void nav(String... person)
  {
   for(String name: person)
    {
     System.out.println("Hello "+name);
    }
  }
public static void main(String[] args)
  {
    Exampleprg ob1= new Exampleprg();
    ob1.nav("Navneet","Arjit","Abhay");
   }
}