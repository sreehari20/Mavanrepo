package examplePackage;


public class UserDAO 	
{
	public static UserBean login(UserBean bean)
	{
		System.out.println("Entered");
		String username = bean.getUsername();    
	    String password = bean.getPassword();  
	    System.out.println(username);
		if(username.equals("MaplesIt"))
	    {
	    	System.out.println("Welcome " + username);
	    	System.out.println(password);
	     	bean.setUserName(username);
	    	bean.setValid(true);   
	    } 
	    //if user exists set the isValid variable to true
	    else 
	    {
	    	System.out.println("Sorry, you are not a registered user! Please sign up first");
	    	bean.setValid(false);
	    }
		return bean;  
	}
}

