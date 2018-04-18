package strings.hacks;

public class UserNameValidator {
	  /*
     * Write regular expression here.
     */
	 public static final String regularExpression = "[a-zA-Z](\\w){7,29}";

	 
	public static void main(String[] args) {
   String userName= "aga";
    if (userName.matches(regularExpression)) {
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
    }  
	}
}
