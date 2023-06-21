/* Password = maximum of stable number + minimum of stable number */

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class Problem {
    public static void main(String[] args) {
        // Five inputs are given by we have to found all the stable number and print the maximum of stable + minimum of stable number  as password
        int realPassword = getPassword(12, 1313, 122, 678, 598);
        System.out.println("The password is " + realPassword);
    }

    /* The method takes all the input and return the password */
    public static int getPassword(int a, int b, int c, int d, int e) {
        int[] arr = { a, b, c, d, e };
        Vector<Integer> stable = new Vector<>();
        // Vector<Integer> unstable = new Vector<>();
        for (int i = 0; i < arr.length; i++) {
            if (isStable(arr[i])) {
                stable.add(arr[i]);
            }
        }
        Collections.sort(stable); 
        // for(int i =0 ; i < stable.size();i++) {
        //     System.out.print(stable.get(i) + " ");
        // }

        int lastIndexStable = stable.size() - 1;
        int maxOfStable = stable.get(lastIndexStable);
        // System.out.println(maxOfStable);
        int minOfstable = stable.get(0);
        // System.out.println(minOfstable);
        int Password = maxOfStable + minOfstable;
        return Password;

    }

    /* This method takes the number and return 
     * true: if the number is stable
     * false: if the number is unstable
     * Notes :- The number is said to be stable if the frequency of all the digit is same like 121212 
     * frequency of 1 is 3
     * frequency of 2 is 3
     */
    public static boolean isStable(int number) {
        HashMap<Character, Integer> hp = new HashMap<>();
        char[] arr = (number + "").toCharArray();
       /* Count the frequency of each digit and stores the frequncy in the map (key,value) */
        for (int i = 0; i < arr.length; i++) {
            if (hp.containsKey(arr[i])) {
                hp.put(arr[i], hp.get(arr[i]) + 1);
            } else {
                hp.put(arr[i], 1);
            }
        }
        Iterator<Character> it = hp.keySet().iterator();
        char key = (char) it.next();
        int checker = hp.get(key);
        /* This checks all the key frequency is same or not 
         * return true if same
         * return false if not same
         */
        while (it.hasNext()) {
            char key1 = (char) it.next();
            if (checker != hp.get(key1)) {
                return false;
            }
        }
        return true;
    }
}