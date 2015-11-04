package test;

import java.text.DateFormat;

public class D extends C{

 	static String bb="";
   //这里面调用的super(bb),bb必须是静态的，如果bb不是静态变量，必须实例化以后才赋值，
 	//实例化的过程中需要调用构造方法，所以编译不过去。
 	//静态变量就算没有实例化也已经赋值，所以初始化构造可以通过。
 	public D(){
    	super(bb);
    }
	
	public D(String aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		DateFormat df =DateFormat.getInstance();
		System.out.println(df);
	}
     
}
