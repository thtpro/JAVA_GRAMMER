package HashImp;

public class LinkNode {
	//obj对象
	public Object data;
  
	//下一个节点
	public LinkNode  next;
	
	public LinkNode(Object obj) {
		data = obj;
	}
	
	public String toString(){
		return (String)data;
	}
	
	public Object getData(){
		return data;
	}
	
	public Object Update(Object o){
		data=o;
		return o;
	}
	
}
