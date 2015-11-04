package Grammer;

public class FinalTest {
public static void main(String[] args) {
	 
}

/**
 * final int[] args  说明args不能再指向其他的数组，即指向的地址不能变。
 * 但是他的内容是可以变得。
 * @param args
 */
void foo(final int [] args){
	if(args.length>0){
		args[0]=5;
	}
}
}
