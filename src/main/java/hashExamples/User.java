package hashExamples;

public class User {
    private String name;
    private int age;
    private String passport;

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }


    //getters and setters, constructor

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        return user.name.equals(name) &&
                user.age == age &&
                user.passport.equals(passport);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + passport.hashCode();
        return result;
    }



}