//package labbbb5;

public class BinarySearchTree {

	 public Node root; 
	 public int levels;
	  
	     
	    BinarySearchTree() {  
	        root = null;  
	    } 
	  
	    
	    public void insert(int key) { 
	       root = insertRec(root, key); 
	    } 
	      
	    
	    public Node insertRec(Node root, int key) { 
	  
	       
	        if (root == null) { 
	            root = new Node(key); 
	            return root; 
	        } 
	  
	       
	        if (key < root.key) { 
	        	
	            root.left = insertRec(root.left, key); 
	        }else if (key > root.key) { 
	        	
	        	root.right = insertRec(root.right, key); 
	        }		        
	        return root; 
	    } 
	  
	     
	    
	
	    
	    
	   
	    public void lowestCommonAncestor(Node n,int level){
	    	
	    	if(level==0) {
	    		printPreorder(root);
	    			
	    	}
	    	
	    	else {
	    		
	    		
	    			
	    		
	    		
	    		
	    		
	    	}
	    		
	    	
	    	
	    }
	    
	    
	    public void printPreorder(Node node) {
	    	if (node == null) 
	            return; 
	  
	        
	        System.out.print(node.key + " "); 
	  
	        
	        printPreorder(node.left); 
	  
	        
	        printPreorder(node.right);
	    	
	    }
	    
	    
	
}
