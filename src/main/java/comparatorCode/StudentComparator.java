package comparatorCode;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


    public int compare(Student s1, Student s2) {
        if(s1.rollno==s2.rollno)
        {
            if(s1.name==(s2.name))
            {
                return s1.address.compareTo(s2.address);
            }
            else
                return s1.name.compareTo(s2.name);
        }
            return s1.rollno-s2.rollno;
    }
}
