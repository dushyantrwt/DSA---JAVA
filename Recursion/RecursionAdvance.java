

public class RecursionAdvance {
    public static void main(String[] args) {
        // System.out.println(tilling(4));
        // String str = "appnacollege";
        // removeString(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(4));
        printBinString(2, 0, new StringBuilder(""));
    }

    public static int tilling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int totalWays = tilling(n-1) + tilling(n-2);
        return totalWays;
    }

    public static void removeString(String str, int i, StringBuilder newstr,boolean map[]){
        if(i == str.length()){
            System.out.println(newstr);
            return ;
        }
        char currchar = str.charAt(i);
        if(map[currchar - 'a'] == true){
            //duplicate condition
            removeString(str, i+1, newstr, map);
        }else{
            map[currchar - 'a'] = true;
            removeString(str, i+1, newstr.append(currchar), map);
        }
    }

    public static int friendsPairing(int n){
        if(n == 1 || n == 2 ){
            return n;
        }   
        return friendsPairing(n-1) +(n-1) * friendsPairing(n-2);
    }

    public static void printBinString(int n , int lastspace, StringBuilder str){

        if(n == 0){
            System.out.println(str);
            return ;
        }
        // Kaam
        printBinString(n-1, 0, str.append("0"));
        if(lastspace == 0){
            printBinString(n-1, 1, str.append("1"));
        }
    }
}