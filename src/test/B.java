package test;

/*
 * ����������ĳ�ʼ�������Ϸ�������д��
 * new B()��ʱ���ȳ�ʼ�����췽����Ȼ���ʼ����Ա������
 * B�����е�super�������������д���print��������ʱ
 * ��Ա����j��û��ʼ����ֵ��Ĭ�ϳ�ʼ��Ϊ0��
 * ���ų�ʼ��B�ĳ�Ա������print��j=40������new B().j
 * ���Խ����03040
 * 
 * �ܽ᣺����˳��
 * ���๹��ͷ
 * ���๹��ͷ�������Ա
 * ���๹������
 * �����Ա
 * ���๹������
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
