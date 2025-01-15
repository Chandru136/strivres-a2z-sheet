import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        ArrayList<Integer> union = new ArrayList<>();

        int n1 = a.length;
        int n2 = b.length;

        int i = 0;
        int j = 0;

        while(i < n1 && j < n2) {
            if(a[i] <= b[j]) {
                if(union.size() == 0 || union.get(union.size()-1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if(union.size() == 0 || union.get(union.size()-1) != b[j]) {
                    union.add(b[j]);
                }
            j++;
            }
        }
        while(i < n1) {
            if(union.size() == 0 || union.get(union.size()-1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }
            
        while(j < n2) {
            if(union.size() == 0 || union.get(union.size()-1) != b[j]) {
                    union.add(b[j]);
                }
            j++;
        }
        return union;
    }
}
