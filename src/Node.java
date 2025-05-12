
public class Node {
	// Instance variables
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int id;
    private Node left, right;

    // Constructor to initialize all fields
    public Node(String firstName, String lastName, int age, int salary, int id) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
        setId(id);
        setLeft(null);
        setRight(null);
    }
 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Node getLeft() {
    	return left;
    }
    
    public void setLeft(Node left) {
     this.left = left;
    }
    
  public Node getRight() {
    	return right;
    }

  
  public void setRight(Node right) {
	     this.right = right;
	  }
	    
  public String toString() {
      return "Employee [ID: " + id + ", Name: " + firstName + " " + lastName + 
             ", Age: " + age + ", Salary: $" + salary + "]";
  }
}
