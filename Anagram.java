import java.util.HashMap;
import java.util.Map;
public class Anagram {
        // Function to check if `X` and `Y` are anagrams or not
        public static boolean isAnagram(String X, String Y)
        {
            // if X's length is not the same as Y's, they can't be an anagram
            if (X.length() != Y.length()) {
                return false;
            }
     
            // create an empty map
            Map<Character, Integer> freqX = new HashMap<>();
     
            // maintain a count of each character of `X` on the map
            for (char c: X.toCharArray()) {
                freqX.put(c, freqX.getOrDefault(c, 0) + 1);
            }
     
            // create a second map
            Map<Character, Integer> freqY = new HashMap<>();
     
            // maintain a count of each character of `Y` on the map
            for (char c: Y.toCharArray()) {//for (int i=0;i<Y.length();i++) 
                freqY.put(c, freqY.getOrDefault(c, 0) + 1);
            }
     
            // return true if both maps have the same content
            return freqX.equals(freqY);
        }
     
        public static void main(String[] args)
        {
            String X = "tommarvoloriddle";        // Tom Marvolo Riddle
            String Y = "iamlordvoldemort";        // I am Lord Voldemort
     
            if (isAnagram(X, Y)) {
                System.out.print("Anagram");
            }
            else {
                System.out.print("Not an Anagram");
            }
        }
    }  

