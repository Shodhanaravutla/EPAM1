package javaclasses;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"Automation");
        map.put(2,"java");
        map.put(null,"css");
        map.put(null,"python");
        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //System.out.println(map.keySet());
        //System.out.println(map.values());
    }
}

