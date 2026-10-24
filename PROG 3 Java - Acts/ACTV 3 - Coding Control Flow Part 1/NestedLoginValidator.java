/*
ACT 3-3 :: Nested Login Validator
@Author: Carl Didal
*/

public class NestedLoginValidator{
    public static void main (String args[]){
        String username = "Gabskrrr";
        String password = "Gabriel2007";
        boolean usernamePass = false;
        boolean passwordPass = false;

        if (username.equals("Gabskrrr")) {
            usernamePass = true;   
            
            if (password.equals("Gabriel2007")) {
                passwordPass = true;

                if (passwordPass && usernamePass) {
                    System.out.println("Logged in.");
                } 
            } else {
                System.out.println("Password Incorrect!");
            }
        } else {
            System.out.println("Username Incorrect!");
        }
    }
}