package Grammer;

import java.util.HashMap;

/*
 * hashmap���������ͬ�Ķ���key��ͬ�Ϳ�����
 */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap hm =new HashMap();
    hm.put("aaa","aaa");
    hm.put("aaa","aaa");
    System.out.println(hm.entrySet());
}
}
