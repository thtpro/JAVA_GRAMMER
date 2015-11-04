package NETprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleSocketClient {
public static void main(String[] args) {
	Socket socket =null;
    InputStream is =null;
    OutputStream os =null;
	String ip ="127.0.0.1";
	int port =10000;
    String data = "helloworld";
    try {
		socket= new Socket(ip,port);
	    //写数据
		os=socket.getOutputStream();
	    os.write(data.getBytes());
	   
	    //写数据
	    is =socket.getInputStream();
	    
    } catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}
}
