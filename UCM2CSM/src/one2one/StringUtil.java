package one2one;

public class StringUtil {

    // special method - parses a given string and eliminates any char c found
    // copied from PathConnAttributes
    public static String trimString(char c, String trim_str) {
        String trimmed_str = null;
        boolean replaced_elements = false;
        for (int s = 0; s < trim_str.length(); s++) {
            if (trim_str.charAt(s) == c) {
                trimmed_str = trim_str.replace(trim_str.charAt(s), ' ');
                replaced_elements = true;
            }
        }
        return replaced_elements ? trimmed_str : trim_str;
    }

}
