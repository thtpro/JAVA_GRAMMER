package HashImp;

public class LinkQueue {
//��һ���ڵ�
	public LinkNode front=null;
	//���һ���ڵ�
	public LinkNode last=null;

	//����ڵ�
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
	 * ��ָ�������²���ڵ�
	 */
	public void insertIndexObj(int index ,Object obj){
		int total=getLength();
		if(index>total ||index<0){
		throw new RuntimeException("Խ����");
		}
		LinkNode l =getLinkNode(index-1);
		l.next=new LinkNode(obj);
		l.next.next=getLinkNode(index);
	}
	
	/*
	 * �õ�����ĳ���
	 * һ��һ���ж��Ƿ�Ϊ�գ�һ���ǿռ�һ���������ջ�ȡ���ȡ�
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
	 * ��������ȡ���ڵ�
	 * ����Ӧ��ҲҪ���Խ����һ˵��
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
	 * ��������ɾ������
	 */
	public void deleteLinkNode(int index){
		int  total =getLength();
		if(index>total||index<0){
			throw  new RuntimeException("Խ��");
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
	 * �޸Ķ���ڵ�
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
		System.out.println("��������"+count);
		
		for(int i=0;i<count;i++){
			LinkNode ln =lq.getLinkNode(i);
		System.out.println("�����"+i+"��Ԫ����"+ln.getData().toString());
		}
		
		 lq.deleteLinkNode(2);  
	        count=lq.getLength();  
	        System.out.println("�������ڵĳ�����"+lq.getLength());  
	        for(int i=0;i<count;i++){  
	            LinkNode ln = lq.getLinkNode(i);  
	            System.out.println("����ĵ�"+i+"��Ԫ�صĵ�ֵΪ"+ln.getData().toString());  
	        }  
	        lq.getLinkNode(1).Update("���º�Ķ���֣�");  
	        for(int i=0;i<count;i++){  
	            LinkNode ln = lq.getLinkNode(i);  
	            System.out.println("����ĵ�"+i+"��Ԫ�صĵ�ֵΪ"+ln.getData().toString());  
	        }  
	        for(int i=0;i<200;i++){  
	            LinkNode ln = new LinkNode(i);  
	            lq.InsertLinkNode(ln);  
	        }  
	        System.out.println("���鳤��Ϊ"+lq.getLength());  
		
	}
}
