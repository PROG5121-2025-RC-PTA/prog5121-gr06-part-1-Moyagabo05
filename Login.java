package st10471918_poe_part1;

public class Login {
    public Login(){}

    // Methods
    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true;
        } else {
            System.out.println("Username is not formatted correctly. It must contain an underscore and be no longer than five characters.");
            return false;
        }
    }

    public boolean checkPasswordComplexity(String password) {
        String capital = ".*[A-Z].*"; 
        String small = ".*[a-z].*"; // Checks small letters
        String special = ".*[!@#$%^&*(),.?\":{}|<>].*"; // Check special characters
        String digit = ".*\\d.*"; // Check digit characters
        if (password.length() >= 8 && password.matches(capital) && password.matches(small)
                && password.matches(digit) && password.matches(special)) {
            System.out.println("Password successfully captured");
            return true;
        } else {
            System.out.println("Passwordis not correctly formatted ; please ensure that  the password is eight  characters long, include capital letter , a , and special characters.");
            return false;
        }
    }

    public boolean checkCellPhoneNumber(String phone) {
        String saCode = "+27";
        if (phone.length() == 12 && phone.startsWith(saCode)) { // Must start with +27 and have 12 characters total
            int fourthDigit = Character.getNumericValue(phone.charAt(3)); // Gets and converts the fourth digit
            if (fourthDigit >= 6 && fourthDigit <= 8) {
                System.out.println("Phone number is valid.");
                return true;
            } else {
                System.out.println("The fourth digit of the phone number must be between 6 and 8.");
                return false;
            }
        } else {
            System.out.println("Phone number must start with +27 and be exactly 12 characters long.");
            return false;
        }
    }

    public String registerUser(String username, String password, String phone) {
        boolean validatePhone = checkCellPhoneNumber(phone);
        boolean validateUsername = checkUserName(username);
        boolean validatePassword = checkPasswordComplexity(password);
        if (validatePhone && validateUsername && validatePassword) {
            return "User is successfully registered.";
        } else {
            return "User registration failed!!!!!";
        }
    }

    public boolean loginUser(String username, String password) {
        boolean validUsername = checkUserName(username);
        boolean validPassword = checkPasswordComplexity(password);
        if (validUsername && validPassword) {
            return true;
        } else {
            return false;
        }
    }

    public String returnLoginStatus(String username, String password) {
        boolean validLogin = loginUser(username, password);
       
        if (validLogin) {
            return "A successful login.";
        } else {
            return "A failed login.";
        }
    }
}

