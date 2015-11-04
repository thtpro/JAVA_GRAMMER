package HashImp;

public class LinkQueue {
//第一个节点
	public LinkNode front=null;
	//最后一个节点
	public LinkNode last=null;

	//插入节点
	public void InsertLinkNode(Object obj){
		if(front==null){
			front=new LinkNode(obj);
			last=front;
		}else{
			LinkNode next =new LinkNode(obj);
			last.next=next;
			last=next;
		}
	}
	
	/*
	 * 在指定索引下插入节点
	 */
	public void insertIndexObj(int index ,Object obj){
		int total=getLength();
		if(index>total ||index<0){
		throw new RuntimeException("越界了");
		}
		LinkNode l =getLinkNode(index-1);
		l.next=new LinkNode(obj);
		l.next.next=getLinkNode(index);
	}
	
	/*
	 * 得到链表的长度
	 * 一个一个判断是否为空，一个非空记一个数，最终获取长度。
	 */
	public int getLength(){
		if(front==null){
			return 0;
		}
		LinkNode l =front;
		int count=0;
		while(l!=null){
			count++;
			l=l.next;
		}
		return count;
	}
	
	
	/*
	 * 根据索引取出节点
	 * 这里应该也要添加越界这一说吧
	 */
	public LinkNode getLinkNode(int index){
		if(front==null){
			return null;
		}
		LinkNode l = front;
		int count=0;
		while(l!=null){
			if(count==index){
				return l;
			}
			count++;
			l=l.next;
		}
		return null;
	}
	
	/*
	 * 根据索引删除链表
	 */
	public void deleteLinkNode(int index){
		int  total =getLength();
		if(index>total||index<0){
			throw  new RuntimeException("越界");
		}
		if(front!=null){
			LinkNode n = front;
		    LinkNode m = front;
		int count =0;
		while(n!=null){
			if(count==index){
				if(n.equals(front)){
					front=front.next;
				}else{
					m.next=n.next;
				}
			}
			m=n;
			n=n.next;
			count++;
		}
		}       
	}
	
	/*
	 * 修改对象节点
	 */
	public void UpdateLinkNode(int index,Object obj){
		LinkNode lNode=getLinkNode(index);
		lNode.Update(obj);
	}
	
	public static void main(String[] args) {
		LinkQueue lq =new LinkQueue();
		LinkNode lq1 =new LinkNode("zr1");
		LinkNode lq2 =new LinkNode("zr2");
		LinkNode lq3 =new LinkNode("zr3");
		LinkNode lq4 =new LinkNode("zr4");
		
		lq.InsertLinkNode(lq1);
		lq.InsertLinkNode(lq2);
		lq.InsertLinkNode(lq3);
		lq.InsertLinkNode(lq4);
		
		int count=lq.getLength();
		System.out.println("链表长度是"+count);
		
		for(int i=0;i<count;i++){
			LinkNode ln =lq.getLinkNode(i);
		System.out.println("链表第"+i+"个元素是"+ln.getData().toString());
		}
		
		 lq.deleteLinkNode(2);  
	        count=lq.getLength();  
	        System.out.println("链表现在的长度是"+lq.getLength());  
	        for(int i=0;i<count;i++){  
	            LinkNode ln = lq.getLinkNode(i);  
	            System.out.println("链表的第"+i+"个元素的的值为"+ln.getData().toString());  
	        }  
	        lq.getLinkNode(1).Update("更新后的对象郑睿");  
	        for(int i=0;i<count;i++){  
	            LinkNode ln = lq.getLinkNode(i);  
	            System.out.println("链表的第"+i+"个元素的的值为"+ln.getData().toString());  
	        }  
	        for(int i=0;i<200;i++){  
	            LinkNode ln = new LinkNode(i);  
	            lq.InsertLinkNode(ln);  
	        }  
	        System.out.println("数组长度为"+lq.getLength());  
		
	}
}
