package hashRelatedCodes;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args){
        HashSet hashSet=new HashSet();
        hashSet.add("abc");
        hashSet.clear();
        hashSet.add("abc");
        hashSet.clone();
        hashSet.forEach((s) -> {
            System.out.println(s);
        });
        hashSet.add("abc");
        boolean a= hashSet.contains("ab");
        System.out.println(a);
        hashSet.add("abc");
        boolean b=hashSet.isEmpty();
        System.out.println(b);
        hashSet.add("abc");
        hashSet.iterator();
        hashSet.add("bcd");
        hashSet.add("bcd");
        hashSet.remove("bcd");
        hashSet.forEach((s) -> {
            System.out.println(s);
        });
        hashSet.add("abc");
        int s=hashSet.size();
        System.out.println(s);
        hashSet.add("abc");
        hashSet.spliterator();

    }
}
