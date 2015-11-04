package Grammer;

public class StringDemo {
public static void main(String[] args) {
	String a  =new String("a");
	String b = "aaa";
	
   System.out.println("b "+b.intern());

   String c ="aaa";
   System.out.println("c "+c.intern());
   
   
}
}
