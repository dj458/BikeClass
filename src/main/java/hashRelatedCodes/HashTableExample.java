package hashRelatedCodes;

import java.util.HashMap;

public class HashTableExample {
       public static void main(String[] args){
           HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
           hashMap.put(1,"a");
           hashMap.put(2,"b");
           hashMap.put(3,"c");
           System.out.println(hashMap);
           System.out.println(hashMap.size());
           System.out.println(hashMap.get(1));
           String a =hashMap.get(1);
           hashMap.remove(2);
           System.out.println(hashMap);
       }
}
