package arrayandString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Food
{
    String name;
    int size;

    public Food(String name,int size)
    {
        this.name = name;
        this.size = size;
    }

    public String toString()
    {
        return this.name + " " + this.size;
    }
}

class Sortbysize implements Comparator<Food>
{
    public int compare(Food a, Food b)
    {
        if(a.size==b.size){
            return a.name.compareTo(b.name);
        }
        return a.size - b.size;
    }
}
class Main
{
    public static void main (String[] args)
    {
        ArrayList<Food> ar = new ArrayList<Food>();
        ar.add(new Food("Tomato", 11));
        ar.add(new Food("Potato", 1));
        ar.add(new Food("Potato", 42));
        ar.add(new Food("Potato", 77));
        ar.add(new Food("Potato", 55));
        ar.add(new Food("Potato", 46));
        ar.add(new Food("Potato", 12));
        ar.add(new Food("Potato", 11));
        ar.add(new Food("Potato", 9));
        ar.add(new Food("Tomato", 121));

        Collections.sort(ar, new Sortbysize());

        System.out.println("\nSorted Food");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
