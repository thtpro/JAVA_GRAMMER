package NETprogram;

import java.net.InetAddress;
import java.net.UnknownHostException;

//����һ��ip����
public class inetAddressdemo {
public static void main(String[] args) {
	try {
	//ʹ��������������
	InetAddress inet1 =InetAddress.getByName("www.baidu.com");
	System.out.println(inet1);
	
	//ʹ��ip��������
	InetAddress inet2=InetAddress.getByName("127.0.0.1");
	System.out.println(inet2);
	
	//��ȡ����ip
	InetAddress inet3 =InetAddress.getLocalHost();
	System.out.println(inet3);
	
	//��ȡ����
	String host=inet3.getHostName();
	System.out.println(host);
	
	//��ȡip
	String ip =inet3.getHostAddress();
	System.out.println(ip);
	
	
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
