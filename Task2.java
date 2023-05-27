package project2;
/*
Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */
public class Task2 {


   boolean isPalindrome(String word) {
       boolean isPalindromeWord = true;
       for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
           if (word.charAt(i) != word.charAt(j)) {
               isPalindromeWord = false;
               break;
           }
       }return isPalindromeWord;
   }
   /* 2.
    boolean isPalindrome(String word){
        String lowerCaseStr=word.toLowerCase();

        String reversedStr="";
        for (int i = word.length()-1; i >=0; i--) {
            reversedStr=reversedStr+word.charAt(i);
        }
        boolean isPalindrome=false;
        if (word.equalsIgnoreCase(reversedStr)){
            isPalindrome=true;
        }
        return isPalindrome;
    }
    */

    public static void main(String[] args) {
        Task2 words = new Task2();
        String word="madam";
        System.out.println(words.isPalindrome(word));
    }
    /* 2.
        Task2 palindrome=new Task2();
        boolean result=palindrome.isPalindrome("madam");
        System.out.println(result);
     */

}
