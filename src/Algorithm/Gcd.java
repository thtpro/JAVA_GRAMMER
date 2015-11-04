package Algorithm;

/**
 * @author THTzzz
 * 求两数最大公约数
 * 通过欧几里得辗转相除法
 */
/*
 * 求n个数的最大公约数
 * 通过创建一个长度为n的链表，求第一个和第二个的最大公约数，然后把第一个数换成最大公约数，第二个数去掉
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
