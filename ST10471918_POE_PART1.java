//This Program was desgined by Moyagabo K ebogile Raphasha
package st10471918_poe_part1;
import javax.swing.JOptionPane;

public class ST10471918_POE_PART1 {

    public static void main(String[] args) {
        Login login = new Login();

        JOptionPane.showMessageDialog(null, "Welcome to the User Registration and Login System!", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        // Step 1: Register User
        String username = JOptionPane.showInputDialog(null, "Enter a username (must contain '_' and be ≤ 5 characters):", "Register Username", JOptionPane.QUESTION_MESSAGE);
        String password = JOptionPane.showInputDialog(null, "Enter a password (at least 8 characters, with uppercase, lowercase, digits, and special characters):", "Register Password", JOptionPane.QUESTION_MESSAGE);
        String phone = JOptionPane.showInputDialog(null, "Enter your phone number (start with '+27' and be exactly 12 characters long):", "Register Phone Number", JOptionPane.QUESTION_MESSAGE);

        String registrationResult = login.registerUser(username, password, phone);
        JOptionPane.showMessageDialog(null, registrationResult, "Registration Result", JOptionPane.INFORMATION_MESSAGE);

        // Step 2: Login User
        String loginUsername = JOptionPane.showInputDialog(null, "Enter your username:", "Login Username", JOptionPane.QUESTION_MESSAGE);
        String loginPassword = JOptionPane.showInputDialog(null, "Enter your password:", "Login Password", JOptionPane.QUESTION_MESSAGE);

        String loginStatus = login.returnLoginStatus(loginUsername, loginPassword);
        JOptionPane.showMessageDialog(null, loginStatus, "Login Status", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
 