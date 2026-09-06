package Strings;

import java.util.Arrays;

public class practiceQuestion {
    public static void main(String[] args) {
        String str = "Dushyant";
        String str1 = "dushyant";

        checkAnagrams(str, str1);
    }

    public static void checkAnagrams(String str1, String str2){
        // Convert to lowercase
        String Str1 = str1.toLowerCase();
        String Str2 = str2.toLowerCase();

        if(Str1.length() == Str2.length()){
            // Converting to character array
            char str1char[] = Str1.toCharArray();
            char str2char[] = Str2.toCharArray();
            // sorting the character array
            Arrays.sort(str1char);
            Arrays.sort(str2char);

            boolean result = Arrays.equals(str1char,str2char);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }

        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }


    public static int checkLowercaseVowel(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        return count;
    }
}
