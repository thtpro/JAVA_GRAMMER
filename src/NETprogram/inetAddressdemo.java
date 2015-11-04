package NETprogram;

import java.net.InetAddress;
import java.net.UnknownHostException;

//代表一个ip对象
public class inetAddressdemo {
public static void main(String[] args) {
	try {
	//使用域名创建对象
	InetAddress inet1 =InetAddress.getByName("www.baidu.com");
	System.out.println(inet1);
	
	//使用ip创建对象
	InetAddress inet2=InetAddress.getByName("127.0.0.1");
	System.out.println(inet2);
	
	//获取本地ip
	InetAddress inet3 =InetAddress.getLocalHost();
	System.out.println(inet3);
	
	//获取域名
	String host=inet3.getHostName();
	System.out.println(host);
	
	//获取ip
	String ip =inet3.getHostAddress();
	System.out.println(ip);
	
	
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
