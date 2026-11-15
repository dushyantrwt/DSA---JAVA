import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // Operations on ArrayList

        // 1.Add Elements
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(1);
        // list.add(1,10);

        // System.out.println(list);

        // 2.Get Element
        // System.out.println(list.get(1));

        // 3.Remove element
        // list.remove(2);
        // System.out.println(list);

        // 4.Set Element in a particular index
        // list.set(0, 10);
        // System.out.println(list);

        // 5.Contains Element or not
        // System.out.println(list.contains(20));
        // System.out.println(list.contains(10));

        // Reverse of an arraylist
        // for(int i=list.size()-1;i>=0;i--){
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // Maximum in arraylist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

    }
}
