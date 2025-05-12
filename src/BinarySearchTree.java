
public class BinarySearchTree {
	
	 private Node root;
	 
	 public BinarySearchTree() {
	        setRoot(null);
	    }

	    public void setRoot(Node root) {
	        this.root = root;
	    }

	    public Node getRoot() {
	        return root;
	    }

	    public boolean isEmpty() {
	        return root == null;
	    }
	    
	    
	    // Insert an employee node based on salary
	    public void insert(Node employee) {
	    	
	    	 // If the employee node is null, do nothing
	        if (employee == null) {
	            return;
	        }
	      
	        // If the tree is empty, set the root to the employee node.
	        if (isEmpty()) {
	            root = employee;
	        } 
	        
	       
	        else {
	        	
	            // Start traversal from the root.
	            Node cursor = root;
	            
	            while (true) {
                 // Keep track of the parent node during traversal.
	              Node parent = cursor;
	              
	                // If the employee's salary is less than or equal to the current node's salary,
	                // move to the left subtree
	                if (employee.getSalary() <= cursor.getSalary()) {
	                   cursor = cursor.getLeft();
	                    
	                    // If there's no left child, insert the employee node here
	                    if (cursor == null) {
	                        parent.setLeft(employee);
	                        return;
	                    }
	                } else {
	                	
	                	// If the employee's salary is greater than the current node's salary,
	                    // move to the right subtree.
                         cursor = cursor.getRight();
	                   
	                    // If there's no right child, insert the employee node here
	                    if (cursor == null) {
	                        parent.setRight(employee);
	                        return;
	                    }
	        
	                }
	           
	            }
	       
	        }
	         
	    }
	    
	    // Method to find the employee with the highest salary.
	    public Node findHighestSalary() {
	        if (isEmpty()) {
	            return null;
	        }
	        
	        Node cursor = root;
	        while (cursor.getRight() != null) {
	            cursor = cursor.getRight();
	        }
	        return cursor;
	    }

	    
	    // Method to find the employee with the lowest salary.
	    public Node findLowestSalary() {
	        if (isEmpty()) {
	            return null;
	        }

	        Node cursor = root;
	        while (cursor.getLeft() != null) {
	            cursor = cursor.getLeft();
	        }
	        return cursor;
	    }


	    
	    
	    // Method to display employee information using pre-order traversal.
	    public void preOrderTraversal(Node cursor) {
	        if (cursor != null) {
	            System.out.println(cursor); 
	            preOrderTraversal(cursor.getLeft());
	            preOrderTraversal(cursor.getRight());
	        }
	    }

	    
	  // Method to get the total number of employees in the organization
	    public int getTotalEmployees(Node cursor) {
	        if (cursor == null) {
	            return 0;
	        }
	        // Count the current node and the total number of nodes in the left and right subtrees
	        return 1 + getTotalEmployees(cursor.getLeft()) + getTotalEmployees(cursor.getRight());
	    }
	    
	    
	

	    
	 // Method that returns the average salary of the employees in the organization
	   
	    public int getAverageSalary() {
	    	
	        // Get the total sum of salaries
	        int totalSalary = getTotalSalary(root);
	        
	        // Get the total number of employees
	        int totalEmployees = getTotalEmployees(root);
	        
	        // Return the average salary, making sure to handle division by zero (if there are no employees)
	        if (totalEmployees == 0) {
	            return 0; // No employees
	        } else {
	            return totalSalary / totalEmployees; // Return the average salary
	        }
	    }
	   
	   
	    
    // Find the total amount of salary
	private int getTotalSalary(Node cursor) {
		// TODO Auto-generated method stub
		
		   if (cursor == null) {
		        return 0;
		    }
		  
		    // Recursively sum the salaries of the current node and its left and right subtrees
		    return cursor.getSalary() + getTotalSalary(cursor.getLeft()) + getTotalSalary(cursor.getRight());

	}
	    

	 

}
