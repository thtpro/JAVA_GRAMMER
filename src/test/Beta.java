package test;

/*
 * 内部类和局部内部类
 * 内部类调用遵循就近调用原则
 */
public class Beta {
	
class A implements Foo{
	public int bar(){
		return 1;
	}
}


public int fubar (Foo foo){
	return foo.bar();
}

public void testFoo(){
	class A implements Foo{
		public int bar(){
			return 2;
		}
		}
	System.out.println(fubar(new A()));
}

public static void main(String[] args){
	new Beta().testFoo();
}
}
