package project2;

/*
Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH".
 */
public class Task1 {
    public String revStr(String word){
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));

        }
        return word;
    }

    public static void main(String[] args) {
        Task1 str=new Task1();
        str.revStr("Hello");
    }
}
