import java.util.*;

public class lowercaseCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        //creating new hash array
        int[] hash = new int[26];
        for(int i=0; i<n; i++) {

            //char - char will give 0-25 value
            //hash function
            hash[s.charAt(i) - 'a']++;  
        }
        
        
        for(int i=0; i<n; i++) {

        }
    }
}