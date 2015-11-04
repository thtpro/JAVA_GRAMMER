package DATAconstruct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class QUEUELINKEDLISTARRAYLIST {
public static void main(String[] args) {
	Queue <String>q =new LinkedList<String>(); 
    q.offer("aaa");
    q.offer("bbb");
    q.offer("ccc");
    q.offer("ddd");
    q.offer("eee");
    System.out.println(q);
    
    String p=q.poll();
    
    System.out.println(p);
    System.out.println(q);
    q.offer("fff");
    System.out.println(q);
    
    
 //   Queue <String> q2=(Queue<String>) new ArrayList<String>();
    
    List <String>  l= new ArrayList<String>();
    l.add("111");
    l.add("222");
    l.add("333");
    l.add("444");
    l.add("555");
    System.out.println(l);
    l.remove(0);
    System.out.println(l);
    l.add("666");
    System.out.println(l);
    
}
}
