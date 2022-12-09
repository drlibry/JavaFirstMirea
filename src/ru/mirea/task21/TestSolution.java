package ru.mirea.task21;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestSolution
{
    public static void main(String[] arg) {
        Solution solution = new Solution();
        Integer[] arr = new Integer[]{1, 2, 3};
        ArrayList<Integer> arrayList = solution.newArrayList(arr);
        System.out.println(arrayList);
        HashSet<Integer> hashSet = solution.newHashSet(arr);
        System.out.println(hashSet);
        HashMap<Integer, String> hashMap = solution.newHashMap(arr, new String[]{"A", "B", "C"});
        System.out.println(hashMap);
    }
}
