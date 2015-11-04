package Grammer;

public class StaticDemo2 {

static void aMethod(StringBuffer sf1,StringBuffer sf2){
	sf1.append(sf2);
	sf2=sf1;
}

/**
 * StringBuffer 是线程安全的，如果容量不够会自动扩容到需求容量的两倍。
 * 最后还是用c实现的。
 * append方法会把字符串加到后面
 * sf2=sf1这个方法只是引用，一旦方法执行完毕，引用变量不复存在，返回到上一个栈中，
 * 上一个栈的引用变量S2还在。并且没有变化。
 * 以后遇到方法中处理字符串的问题，从栈的角度和变量作用域的角度去考虑问题。
 * @param args
 */
public static void main(String[] args) {
	
	StringBuffer s1 =new StringBuffer("A");
	StringBuffer s2 =new StringBuffer("B");
	aMethod(s1,s2);
	System.out.println(s1+":"+s2);
}
}
