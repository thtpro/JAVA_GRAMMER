package Algorithm;

/**
 * @author THTzzz
 * ���������Լ��
 * ͨ��ŷ�����շת�����
 */
/*
 * ��n���������Լ��
 * ͨ������һ������Ϊn���������һ���͵ڶ��������Լ����Ȼ��ѵ�һ�����������Լ�����ڶ�����ȥ��
 */
public class Gcd {
	public static int gcd(int a , int b){
	   while(b!=0){
		int temp =a%b;
		a = b;
		b=temp;
	}
		return a; 
	}
	
	public static void main(String[] args) {
		int a = 55;
		int b = 66;
		int result = gcd(a,b);
		System.out.println(result);
	}
}
