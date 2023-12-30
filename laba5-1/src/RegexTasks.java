import java.util.regex.*;

public class RegexTasks {
    public static void main(String[] args) {
        String password = "P@ssw0rd";
        Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,16}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);

        if (passwordMatcher.matches()) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}

