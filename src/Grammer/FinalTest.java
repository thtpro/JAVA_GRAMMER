package Grammer;

public class FinalTest {
public static void main(String[] args) {
	 
}

/**
 * final int[] args  ˵��args������ָ�����������飬��ָ��ĵ�ַ���ܱ䡣
 * �������������ǿ��Ա�á�
 * @param args
 */
void foo(final int [] args){
	if(args.length>0){
		args[0]=5;
	}
}
}
