package �����ڲ���;

/**
 * ֱ��newһ�����࣬������ϴ����ţ�����ʵ�ֻ��߼̳еķ���
 * ֱ��д�ڷ������ڡ�
 * һ��ֻ��һ�Ρ�
 * д��֮����Ҫ���á�
 * @author THTzzz
 *
 */
public class �����ڲ���ʵ��cp {
 public static void main(String[] args) {
	Person p = new Child(){
		public void eat(){
			System.out.println("eat �����ڲ���");
		}
	};
	p.eat();
}
}
