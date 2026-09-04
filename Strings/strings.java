
package Strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String names = sc.nextLine();
        // String str = "vugcvuygw";
        // String str1 = new String("fvshusvbdcusvuh");
        // System.out.println(names);
        // System.out.println(str);
        // System.out.println(str1);
        
        // String firstname = "Dushyant";
        // String lastname  = "Rawat";
        // String fullname = firstname + " " + lastname;
        // System.out.println("Full name is : " + Fullname);
        // System.out.println(Fullname.charAt(0));
        // printLetter(fullname); 
        // String str = "WNEENESENNN";
        // int si =2, ei = 5;
        // System.out.println(checkPalindrome(str));
        // System.out.println(shortestPath(str));
        // System.out.println(subString(str, si, ei));

        // String fruits[] = {"papaya","apple","banana","orange"};
        // System.out.println(getlargestString(fruits));

        // StringBuilder sb = new StringBuilder("");
        // for(char ch ='a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        String str = "aabbbcccdd";
        // System.out.println(stringtoUppercase(str));
        System.out.println(stringCompression(str));
    }

    public static String stringCompression(String str){
        String sb = "";
        
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
                count ++;
                i++;
            }
            sb += str.charAt(i);
            if(count > 1){
                sb += count.toString();
            }
        }
        return sb;
    }

    public static String stringtoUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i <str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String getlargestString(String str[]){
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest = str[i];
            }
        }

        return largest;
    }
    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean checkPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }

        return true;
    }

    public static double shortestPath(String str){
        double shortestPath = 0;
        double x=0 ,y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'W'){
                x++;
            }
            else if(str.charAt(i) == 'E'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }

        shortestPath = Math.sqrt((x*x)+(y*y));
        return shortestPath;
    }

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i =si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
}
