
public class TreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(new Node("John", "Dier", 28, 55000, 1));
		bst.insert(new Node("Eric", "Smith", 35, 72000, 2));
		bst.insert(new Node("Willy", "Wilson", 30, 48000, 3));
		bst.insert(new Node("Alice", "Brown", 25, 70000, 4));
		bst.insert(new Node("David", "Gilmour", 40, 60000, 5));
		bst.insert(new Node("Sophia", "Johnson", 29, 62000, 6));
		bst.insert(new Node("James", "Rashford", 32, 54000, 7));
		bst.insert(new Node("Olivia", "Martinez", 45, 92000, 8));
		bst.insert(new Node("Liam", "Garcia", 38, 97000, 9));
		bst.insert(new Node("Emma", "Anderson", 27, 50000, 10));
		
		
   
        System.out.println("Employee with the highest salary: " + bst.findHighestSalary());
      
        System.out.println("Employee with the lowest salary: " + bst.findLowestSalary());

        System.out.println("Pre-order traversal of employees:");
        bst.preOrderTraversal(bst.getRoot());
       
        System.out.println("Total Employees: " + bst.getTotalEmployees(bst.getRoot()));
	
        System.out.println("Average Salary: " + bst.getAverageSalary());
	
	

	}

}
