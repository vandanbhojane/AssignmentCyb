//Object and Class
//Create a class with data members and constructor. Pass values through constructor and assign it to variables.
//Then create an object of the class and print the value of data members.

package objectclass;

		// Class Declaration 
		public class objectclass
		{
		    // Instance Variables
		    String name;
		    String config;
		    int cost;
		    String os;
		   
		    // Constructor Declaration of Class
		    public objectclass(String name, String config,int cost, String os)
		    {
		        this.name = name;
		        this.config = config;
		        this.cost = cost;
		        this.os = os;
		    }
		   
		    // method 1
		    public String getName()
		    {
		        return name;
		    }
		   
		    // method 2
		    public String getConfig()
		    {
		        return config;
		    }
		   
		    // method 3
		    public int getCost()
		    {
		        return cost;
		    }
		   
		    // method 4
		    public String getOs()
		    {
		        return os;
		    }
		   
		   
		    public static void main(String[] args)
		    {
		      // creating object using new operator
		    	objectclass c1 = new objectclass("Apple","i5", 50000, "IOS");
		  
		      System.out.println("The company name is "+ c1.getName());
		      System.out.println("The configuration  is "+ c1.getConfig());
		      System.out.println("Its Cost is "+ c1.getCost());
		      System.out.println("Its operating System  "+ c1.getOs());
		        
		    }
		}

	


