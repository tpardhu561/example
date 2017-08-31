package intro;

public class MyClass 
{ 
   public String printMessage(String name) 
   {
      if (name == "") 
      {
         return "Hello!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
      //new comment
   }
//another comment
   public static void main(String[] args)
   {
	   MyClass mc = new MyClass();
	   System.out.println(mc.printMessage(""));
	   System.out.println(mc.printMessage("World"));
   }
}
