package test;

import java.text.DateFormat;

public class D extends C{

 	static String bb="";
   //��������õ�super(bb),bb�����Ǿ�̬�ģ����bb���Ǿ�̬����������ʵ�����Ժ�Ÿ�ֵ��
 	//ʵ�����Ĺ�������Ҫ���ù��췽�������Ա��벻��ȥ��
 	//��̬��������û��ʵ����Ҳ�Ѿ���ֵ�����Գ�ʼ���������ͨ����
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
