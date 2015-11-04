package test;

/*
 * 考的是子类的初始化，加上方法的重写。
 * new B()的时候先初始化构造方法，然后初始化成员变量。
 * B构造中的super调用了子类的重写后的print方法，这时
 * 成员变量j还没初始化赋值，默认初始化为0，
 * 接着初始化B的成员变量，print，j=40，调用new B().j
 * 所以结果是03040
 * 
 * 总结：调用顺序
 * 子类构造头
 * 父类构造头，父类成员
 * 父类构造走完
 * 子类成员
 * 子类构造走完
 */
public class B extends A {
 int j =30;
	B (){
	super();
	 print();
	 j=40;
 }
	
	void print(){
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		System.out.println(new B().j);
	}
}
