package Grammer;

public class StaticDemo2 {

static void aMethod(StringBuffer sf1,StringBuffer sf2){
	sf1.append(sf2);
	sf2=sf1;
}

/**
 * StringBuffer ���̰߳�ȫ�ģ���������������Զ����ݵ�����������������
 * �������cʵ�ֵġ�
 * append��������ַ����ӵ�����
 * sf2=sf1�������ֻ�����ã�һ������ִ����ϣ����ñ����������ڣ����ص���һ��ջ�У�
 * ��һ��ջ�����ñ���S2���ڡ�����û�б仯��
 * �Ժ����������д����ַ��������⣬��ջ�ĽǶȺͱ���������ĽǶ�ȥ�������⡣
 * @param args
 */
public static void main(String[] args) {
	
	StringBuffer s1 =new StringBuffer("A");
	StringBuffer s2 =new StringBuffer("B");
	aMethod(s1,s2);
	System.out.println(s1+":"+s2);
}
}
