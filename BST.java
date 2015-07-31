# Binarytree
This is a mall program to describe binary tree


public class BST {
	private Node root;
	
	public BST(){
		root=null;
	}
	
	public BST(Node newnode){
		root =newnode;
	}
	
	public Node getroot()
	{
		return root;
	}
	
	
	private void displaytree(Node root1){
	     if(root1!=null){
	    	 displaytree(root1.getleft());
	    	 System.out.println(root1.getdata());
	    	 displaytree(root1.getright());
	     }
		
	}
	
	public void inorderdisplay()
	{
		displaytree(root);
	}
	
	
	private int getheight(Node root1)
	{   
	    if (root1!=null)
	    {     
	    	return Math.max(getheight(root1.getleft()),getheight(root1.getright()))+1;
	    }
	    
	    else 
	    	return 0;
		
	}
	
	public int binarytreeheight()
	{
		return getheight(root);
	}
	
	public boolean testrootsequal(Node root1, Node root2)
	{   
	    if(root1==null && root2==null)
	    	return true;
	    if((root1==null&&root2!=null)||(root1!=null&&root2==null))
	    	return false;
	    else
	    	return (root1.getdata()==root2.getdata())&&(testrootsequal(root1.getleft(),root2.getright()))&&(testrootsequal(root1.getleft(),root2.getright()));
		
	}
	
	public Object findmindata()
	{  Node t;
	    t=root;
	  if(t!=null){
	      while(t.getleft()!=null)
	      {
		     t=t.getleft();
	      }
	  
	  
	  return t.getdata();
	  }
	  return null;
	
	}
	
	public Object findmaxdata()
	{
		Node t=root;
		if (t!=null){
			while(t.getright()!=null){
				
				t=t.getright();
			}
		return t.getdata();
		}
	   return null;
	}
	
	public Node insert(Node root1,Object data){
		
		
		
		return root1;
	}

}
