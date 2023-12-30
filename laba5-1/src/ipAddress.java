import java.util.regex.*;

public class ipAddress {
    public static void main(String[] args) {
        String ipAddress = "512.512.52.00";
        Pattern ipPattern = Pattern.compile("^((\\d{1,2}|[1-4]\\d{2}|50\\d|51[0-2])\\.){3}(\\d{1,2}|[1-4]\\d{2}|50\\d|51[0-2])$");
        Matcher ipMatcher = ipPattern.matcher(ipAddress);
        if (ipMatcher.matches()) {
            System.out.println("IP Address is valid");
        } else {
            System.out.println("IP Address is invalid");
        }
    }
}
