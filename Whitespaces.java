public class Whitespaces {
        public static void main(String[] args) {
            String sentence = " S A MI    ULL   A H .";
            System.out.println("Original sentence: " + sentence);
//In the aboe program, we use String's replaceAll() method to remove and replace all whitespaces in the string sentence.We've used regular expression \\s that finds all white space characters (tabs, spaces, new line character, etc.) in the string. Then, we replace it with "" (empty string literal).
            sentence = sentence.replaceAll("\\s", "");
            System.out.println("After replacement: " + sentence);
        }
}
