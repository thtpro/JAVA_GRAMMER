package Grammer;

public class StringDemo2 {
    //静态变量：相当于该对象全局变量，不需要实例化对象就初始化了。
	static String s1;
    //实例变量，属于某个具体的实例，对象实例化以后才能默认初始化赋值。
    String s2;
	public static void main(String[] args) {
	//局部变量要手动初始化。
	String s3 = null;
	System.out.println(s1);
	//System.out.println(s2);
	System.out.println(s3);

	//static不能修饰局部变量
	//static String s4;  X
	
	//在外部调用静态方法时，可以使用“类名.方法名”的方式，也可以使用“对象名.方法名”的方式。而实例方法只有后面这种方式。也就是说，调用静态方法可以无需创建对象。
	//静态方法在访问本类的成员时，只允许访问静态成员（即静态成员变量和静态方法），而不允许访问实例成员变量和实例方法；实例方法则无此限制。
}
}
