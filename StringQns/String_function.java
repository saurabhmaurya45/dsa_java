package StringQns;



class String_function {

    // count the words in a line or sentence.
    public static int countWords(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i - 1) != ' ' && str.charAt(i) == ' ') || (str.charAt(i) != ' ' && i == str.length() - 1)) {
                count++;
            }

        }
        return count;
    }

    // remove the space from the string
    public static String spaceRemover(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                res += str.charAt(i);
            }
        }

        return res;
    }

    // find displacement when we are going E,W,N,S from 1 unit
    public static double displacementFinder(String str) {
        double res;
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                x--;
            }
        }
        res = Math.sqrt((x * x + y * y));
        return res;
    }

    public static void main(String[] args) {

        String str = "Shubham";
        int n = str.length();
        System.out.println(n);

        // System.out.println(displacementFinder(str));

    }
}