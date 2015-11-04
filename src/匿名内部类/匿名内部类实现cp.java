package 匿名内部类;

/**
 * 直接new一个子类，后面加上大括号，加上实现或者继承的方法
 * 直接写在方法体内。
 * 一般只用一次。
 * 写完之后需要调用。
 * @author THTzzz
 *
 */
public class 匿名内部类实现cp {
 public static void main(String[] args) {
	Person p = new Child(){
		public void eat(){
			System.out.println("eat 匿名内部类");
		}
	};
	p.eat();
}
}
