public class findpermutation {
    public static void main(String[] args) {
        String str = "Rawat";
        findPermutations(str, "");
    }

    public static void findPermutations(String str, String ans){
        // Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }
        // Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            findPermutations(newstr, ans+curr);
        }
    }
}
