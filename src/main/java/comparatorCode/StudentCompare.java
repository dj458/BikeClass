package comparatorCode;

import java.util.ArrayList;
import java.util.Collections;

//compareTo() is from the Comparable interface.
//compare() is from the Comparator interface.
//Both methods do the same thing, but each interface is used in a slightly different context.
//The Comparable interface is used to impose a natural ordering on the objects of the implementing class.
// The compareTo() method is called the natural comparison method.
// The Comparator interface is used to impose a total ordering on the objects of the implementing class.
// The compare() method has more customize ways to compare two classes



public class StudentCompare{
    public static void main(String args[]) {
        ArrayList<Student> ar1 = new ArrayList<Student>();
        ar1.add(new Student(1, "b", "a"));
        ar1.add(new Student(2, "c", "c"));
        ar1.add(new Student(2, "c", "a"));
        ar1.add(new Student(2, "a", "c"));

        //Comparable
        System.out.println("Comparable Result");
        Collections.sort(ar1);
           for (Student student: ar1)
           {
            System.out.println(student.rollno+ student.name+student.address);
           }
        //comparator
        System.out.println("Comparator Result");
         StudentComparator studentComparator=new StudentComparator();
           Collections.sort(ar1,studentComparator);
           for (Student student: ar1)
        {
            System.out.println(student.rollno+ student.name+student.address);
        }
    }
}
