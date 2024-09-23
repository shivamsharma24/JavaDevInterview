package shivam.synchr_concurrent_hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map= new ConcurrentHashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");


        for (Map.Entry <Integer,String>  entry:map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }

}
