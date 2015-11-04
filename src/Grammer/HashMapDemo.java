package Grammer;

import java.util.HashMap;

/*
 * hashmap允许添加相同的对象，key不同就可以了
 */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap hm =new HashMap();
    hm.put("aaa","aaa");
    hm.put("aaa","aaa");
    System.out.println(hm.entrySet());
}
}
