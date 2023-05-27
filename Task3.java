package project2;
/*
Count the Number of Words in a String:
Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation.
For example, the input "Hello, world!" should return 2.
 */
public class Task3 {
  public static int countNumberOfString(String  st){

       String[] words = st.split("[!?.,]");
       int count = 0;
       for (String word : words) {
           if (!word.isEmpty()) {
               count++;
           }
       }
       return count;
   }
    public static void main(String[] args) {
        String st = "Hello, world!";
        int wordCount = countNumberOfString(st);
        System.out.println(wordCount);
    }
}
