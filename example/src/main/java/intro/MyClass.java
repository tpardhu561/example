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
   }
//this is a comment
   public static void main(String[] args)
   {
	   MyClass hw = new MyClass();
	   System.out.println(hw.printMessage(""));
	   System.out.println(hw.printMessage("World"));
   }
}
