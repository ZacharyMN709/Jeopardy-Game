package Utility;

public class TextHandling {

    public static String htmlText(String in, int len) {
        String txt = "<html>";
        char[] array = in.toCharArray();
        int x = 0;
        for (char ch : array) {
            x++;
            if(x>len && ch == ' '){
                x = 0;
                txt += "<br>";
            } else {
                txt += ch;
            }
        }
        txt += "</html>";

        return txt;
    }
}
