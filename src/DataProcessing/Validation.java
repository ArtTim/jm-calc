package DataProcessing;


public class Validation {
    public int consoleValid(String a, String b, String c) {
        if (a.matches("[A-aZ-z]{1,4}") && b.matches("[A-aZ-z]{1,4}") && c.matches("[\\-\\+\\*\\/]")) {
            return 1; // Romanian digits
        } else if (a.matches("[0-9]{1,2}") && b.matches("[0-9]{1,2}") && c.matches("[\\-\\+\\*\\/]")){
            return 2; // Arabian digits
        } else {
            return 0; // Wrong issue
        }
    }
}
