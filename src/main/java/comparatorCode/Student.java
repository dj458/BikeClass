package comparatorCode;

public  class Student implements Comparable<Student> {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    @Override
    public int compareTo(Student s) {
        return this.rollno-s.rollno;
    }

}
