import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(10);
        list.add(34);
        list.add(10);
        for(int i =0; i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        for( int values: list)
        {
            System.out.println(values);
        }
        System.out.println("list: "+list);
        Set set = new HashSet<>(list);

        System.out.println("set: "+set);

        //
        Set<String> set1 = new HashSet<>();
        set1.add("Test");
        set1.add("Automation");
        set1.add("Java");
        System.out.println("set1: "+set1);
        // we dont have get method in set
        System.out.println(set1.add("selenium"));
        System.out.println(set1.add("selenium"));// it gives false because it already contains the same element


        Iterator<Integer> iterator =list.iterator();// it returns the reference
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //System.out.println(iterator);

        Iterator<String> iterator1 =set1.iterator();// it returns the reference
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }


        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}
