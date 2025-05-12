public class Exercise10_25 {
    public static void main(String[] args) {
        String[] str1 = split("ab#12#453", "#");

        for (String str : str1) {
            System.out.print(str + " ");
        }

        String[] str2 = split("a?b?gf#e", "[?#]");

        for (String str : str2) {
            System.out.print(str + " ");
        }
    }

    public static String[] split(String s, String regex) {
        String[] strArr = s.split(regex);
        String[] strArr2 = new String[strArr.length];

        String[] regexArr = new String[1];
        regexArr[0] = regex;

        if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']') {
            String regexString = regex.substring(1, regex.length() - 1);

            regexArr = new String[regexString.length()];
            regexArr = split(regexString, "");
        }

        int i = 0;
        for (String regexString: regexArr) {
            if (s.matches(".*" + regexString + ".*") ||
                s.matches(".*" + regexString)) {
                i = 1;
                break;
            }
        }

        for (String regexString: regexArr) {
            if (s.matches(regexString) || s.matches(regexString + ".*") ||
                s.matches(".*" + regexString + ".*") || s.matches(".*" + regexString)) {
                s = s.replaceFirst(regexString, "");

                strArr2 = new String[strArr.length + 1];
                strArr2[i] = regexString;
                i += 2;

                for (String str: strArr) {
                    for (String str2: strArr2) {
                        if (str2 == null) {
                            str2 = str;
                        }
                    }
                }
            }
        }
        return strArr2;
    }
}
