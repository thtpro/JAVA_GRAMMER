package Grammer;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class ListDemo {
public static void main(String[] args) {
	//Queue 特殊的线性表，前端删除，后端插入
	Queue q =new LinkedList();
	
	//ArrayList 排序数组，randomAccess，大量插入删除慢，add方法添加到队尾，相当于是数组实现。
	ArrayList  l = new ArrayList();
	
	//链表，双向队列可以某个位置插入，查询慢，
    LinkedList ll =new LinkedList();
    
    //TreeSet 有序集
    TreeSet ts =new TreeSet();
    ts.add("a");
    ts.add("b");
    ts.add("c");
    ts.add("d");
    ts.add("e");
    System.out.println(ts);
    /*
     * subSet方法返回的是一个view，不是一个copy，如果ts变化会反应到sub，同样sub变化的话也会反映到ts
     */
    TreeSet tssub1=(TreeSet) ts.subSet("a", "c");//subSet 方法是返回的set含头不含尾。
    TreeSet sub2 =(TreeSet) ts.subSet("a",true, "c", true);//true 参数表示是否包含边缘元素。
    System.out.println(ts);
    System.out.println(tssub1);
    System.out.println(sub2);

    //需要导入一个汉语拼音的包
    // HanyuPingyinOutputFormat h =new HanyuPingyinOutputFormat(); 
}
}
