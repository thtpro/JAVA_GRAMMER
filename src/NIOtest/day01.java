package NIOtest;

import java.nio.IntBuffer;

public class day01 {
public static void main(String[] args) {
	 // �»������ĵ�ǰλ�ý�Ϊ�㣬�����(����λ��)��Ϊ����������������һ���ײ�ʵ�����飬������ƫ������Ϊ�㡣
	IntBuffer buffer= IntBuffer.allocate(8);
	
	for(int i=0;i<buffer.capacity();i++){
		int j = 2*(i+1);
		buffer.put(j);
	}
	
	buffer.flip();
	
	// �鿴�ڵ�ǰλ�ú�����λ��֮���Ƿ���Ԫ��  
    while (buffer.hasRemaining()) {  
        // ��ȡ�˻�������ǰλ�õ�������Ȼ��ǰλ�õ���  
        int j = buffer.get();  
        System.out.print(j + "  ");  
    }  
}
}
