public class Main {
    public static void main(String[] args) {
        ParindromeHelper parindromeHelper = new ParindromeHelper();

        System.out.println(parindromeHelper.isParindrome("madam"));

        System.out.println(parindromeHelper.isParindrome("maytee"));

        System.out.println(parindromeHelper.isParindrome("nurses run"));

        System.out.println(parindromeHelper.isParindrome("This is not a parindrome"));

        System.out.println(parindromeHelper.isParindrome("racecar"));
    }
}
