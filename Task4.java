package project2;
/*
Check if Two Strings are Anagrams: Given two strings,
determine if they are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class Task4 {

  public static  boolean isAnagram(String str1, String str2){
        boolean isAnagr=false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j <str2.length() ; j++) {
                char ch1=str1.charAt(i);
                char ch2=str2.charAt(j);
                if (ch1==ch2){
                    isAnagr=true;
                }
            }
        }
        return isAnagr;
    }

    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        boolean isAnagrams=isAnagram(str1,str2);
        System.out.println(isAnagrams);
    }
}
