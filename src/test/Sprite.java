package test;

public class Sprite {
 public int fubar(Foo foo){
	return foo.bar(); 
 }
 
 //�����ڲ���
 public void testFoo(){
	 fubar(new Foo(){
		 public int bar(){
			 return 1;
		 }
	 });
 }
}
