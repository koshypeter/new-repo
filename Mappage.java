import java.util.*;
public class Mappage {
    public static void main(String[] args)
    {
        Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> map2=new HashMap<>();
        map.put(1,"Abhishek");
        map.put(2,"Yadu");
        map.put(3,"Austin");
        map.put(4,"Ashish");
        map.put(5,"Aswin");
        map.put(6,"Amal");
        map2.putAll(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(3));
        //System.out.println(map);
        //System.out.println(map2);
        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Austin"));
        map.replace(4,"Pavi");
        System.out.println(map);


    }
}
