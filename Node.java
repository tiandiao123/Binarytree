
public class Node {
	private Object data;
	private Node left=null;
    private Node right=null;
    
    
    public Node(Object o,Node newleft,Node newright)
    {
    	data=o;
    	left=newleft;
    	right=newright;
    }
    
    public Node(Object o)
    {
    	data=o;
    }
    
    
    public Object getdata()
    {
    	return data;
    	
    }
    
    public Node getleft()
    {
    	return left;
    }
    
    public Node getright()
    {
    	return right;
    }

    public void setright(Node newright)
    {
    	right=newright;
    }
    
    public void setleft(Node newleft)
    {
    	left=newleft;
    }
    
    public void setdata(Object newdata)
    {
    	data=newdata;
    }
   
}
