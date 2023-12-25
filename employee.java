class Employee
{
  String name;
  int emp_id;
  String Company_name="Smart Programming";
  Employee(String name,int emp_id)
  {
   this.name=name;
   this.emp_id=emp_id;   
  }
  void display()
  {
   System.out.println(name+" "+emp_id);
  }
  public static void main(String[] args)
  {
   Employee e1=new Employee("Navneet",101);
   e1.display();
   Employee e2=new Employee("Allu",102);
   e2.display();
  }
}