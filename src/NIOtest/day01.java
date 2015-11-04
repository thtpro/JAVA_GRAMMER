package NIOtest;

import java.nio.IntBuffer;

public class day01 {
public static void main(String[] args) {
	 // 新缓冲区的当前位置将为零，其界限(限制位置)将为其容量。它将具有一个底层实现数组，其数组偏移量将为零。
	IntBuffer buffer= IntBuffer.allocate(8);
	
	for(int i=0;i<buffer.capacity();i++){
		int j = 2*(i+1);
		buffer.put(j);
	}
	
	buffer.flip();
	
	// 查看在当前位置和限制位置之间是否有元素  
    while (buffer.hasRemaining()) {  
        // 读取此缓冲区当前位置的整数，然后当前位置递增  
        int j = buffer.get();  
        System.out.print(j + "  ");  
    }  
}
}
