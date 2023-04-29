import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //3rd way(converting array to array list

        Integer[] numbers={1,34,5};
        List<Integer> list0=new ArrayList<>(Arrays.asList(numbers));

        //1st way
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(10);
        list.add(34);
        list.add(10);

         //2nd way

        List<Integer> list1=new ArrayList<>(list);
        System.out.println("list0: "+list0);
        System.out.println("list1: "+list1);
        // we have four methods to add elements to the list
        list.add(1,45);
        System.out.println(list);


        // different types of add methods (addAll, addAll(ind,ele)

        List<Integer> list3=new ArrayList<>();
        list3.addAll(list);
        System.out.println("list3: "+list3);

        List<Integer> list4=new ArrayList<>();
        list4.add(0);
        list4.add(1);
        list4.addAll(1,list0);
        System.out.println("list4: "+list4);

        System.out.println(list1.get(1));
        System.out.println(list1.indexOf(10));

        System.out.println(list4.size());

        list.remove(2);

        System.out.println(list);
        // removeall is same as addall
        list.removeAll(list);
        System.out.println(list);

        System.out.println(list1.contains(45));
        // add, size,contains are the main methods that are mostly used
    }
}
