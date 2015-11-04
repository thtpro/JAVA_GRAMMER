package JvmTest;
public class JvmTest {
public static void main(String[] args) {
	//判断jre是32位还是64位的
	System.out.println(System.getProperty("sun.arch.data.model"));
}
}
