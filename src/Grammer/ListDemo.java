package Grammer;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class ListDemo {
public static void main(String[] args) {
	//Queue ��������Ա�ǰ��ɾ������˲���
	Queue q =new LinkedList();
	
	//ArrayList �������飬randomAccess����������ɾ������add������ӵ���β���൱��������ʵ�֡�
	ArrayList  l = new ArrayList();
	
	//����˫����п���ĳ��λ�ò��룬��ѯ����
    LinkedList ll =new LinkedList();
    
    //TreeSet ����
    TreeSet ts =new TreeSet();
    ts.add("a");
    ts.add("b");
    ts.add("c");
    ts.add("d");
    ts.add("e");
    System.out.println(ts);
    /*
     * subSet�������ص���һ��view������һ��copy�����ts�仯�ᷴӦ��sub��ͬ��sub�仯�Ļ�Ҳ�ᷴӳ��ts
     */
    TreeSet tssub1=(TreeSet) ts.subSet("a", "c");//subSet �����Ƿ��ص�set��ͷ����β��
    TreeSet sub2 =(TreeSet) ts.subSet("a",true, "c", true);//true ������ʾ�Ƿ������ԵԪ�ء�
    System.out.println(ts);
    System.out.println(tssub1);
    System.out.println(sub2);

    //��Ҫ����һ������ƴ���İ�
    // HanyuPingyinOutputFormat h =new HanyuPingyinOutputFormat(); 
}
}
