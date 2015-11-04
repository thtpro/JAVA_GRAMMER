package DATAconstruct;

public class DataType {
  static long a [] = new long[10];
  public static void main(String[] args) {
	System.out.println(a[6]);
	
	long a  =111;
	double d =222.22;
	float f = (float) 333.22;
	
	String str = "aaa";
	System.out.println(str.length());
	
	int [] m ={1,2,3,4,45,5};
	System.out.println(m.length);
	
	String  x =new String("hello");
	String  y =new String("hello");
	System.out.println(x==y);
	
	String a1 = null ;
	System.out.println(a1);
	
	byte z =(byte) 225;
	
	int twoDim[][]=new int [4][];
//	int twoDim2[][]=new int [][5];
	
	int one[]=new int[10];
}
}
