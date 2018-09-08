package hashExamples;
//
//Why HashTable doesn’t allow null and HashMap does?
//        To successfully store and retrieve objects from a HashTable,
//        the objects used as keys must implement the hashCode method and the equals method.
//        Since null is not an object, it can’t implement these methods.
//        HashMap is an advanced version and improvement on the Hashtable.
//        HashMap was created later.
import java.util.HashMap;

public class HashMapExample {
    public static void main(String [] args)
    {
        HashMap<String, Integer> map=new HashMap();
        System.out.println(map);
        map.put("a",1);
        map.put("b",2);
        map.put("b",3);
        map.put("",4);
        System.out.println("size of map="+map.size());
        System.out.println(map);
        Integer c=map.get("a");
        System.out.println(c);
        map.remove("a");
        System.out.println("remove the map key a="+map);
        map.remove("b");

        String x="good";
        String h="good";
        String x1="goodd";
        String h1="goodd";

        System.out.println("Two string are equal? "+x.equals(h));//compare string hashcode value
        System.out.println("Two string are equal 222? "+(x1==h1));//compare memnory location


    }

}
