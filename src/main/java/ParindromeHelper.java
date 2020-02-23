public class ParindromeHelper {
    public Boolean isCenter(char firstChar, char lastChar) {
        Boolean result = false;

        if(firstChar == lastChar || lastChar - firstChar == 1) {
            result = true;
        }

        return result;
    }

    public Boolean isParindrome(String s) {
        String newString = s.replace(" ", "").trim();

        Boolean result = true;

        int firstIndex = 0;
        int lastIndex = newString.length() - 1;

        char firstChar = newString.charAt(firstIndex);
        char lastChar = newString.charAt(lastIndex);

        while(result && !isCenter(firstChar, lastChar)) {
            if(firstChar != lastChar) {
                result = false;
            }

            firstIndex = firstIndex + 1;
            lastIndex = lastIndex - 1;

            firstChar = newString.charAt(firstIndex);
            lastChar = newString.charAt(lastIndex);
        }

        return result;
    }

    public boolean isParindrome2(String str) {
        boolean result = false;
        int middle = str.length() / 2;

        for(int i = 0; i< middle && !result; i++) {
            if(str.charAt(i) == str.charAt(str.length()- (i+1))) {
                result = true;
            }
        }

        return result;
    }
}
