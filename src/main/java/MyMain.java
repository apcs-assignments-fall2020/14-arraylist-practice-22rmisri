import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (x % 2 != 0) {
                c = c + 1;
            }
        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++) {
            int x = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                int y = list2.get(j);
                if (x == y) {
                    return true;
                }
            }

        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList <Integer> list = new ArrayList <Integer> ();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            list.add(x);
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <Integer> ();
        ArrayList <Integer> list2 = new ArrayList <Integer> ();
        int [] arr = {5, 6, 7, 8};
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(12);
        list2.add(12);
        list2.add(13);
        list2.add(15);
        System.out.println(countOdd(list));
        System.out.println(checkDuplicates(list, list2));
        System.out.println(convertToArrayList(arr));
    }
}
