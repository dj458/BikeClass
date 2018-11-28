package comparatorCode;
import java.io.*;
import java.util.*;
import java.util.stream.*;

class MyCode {

    public static class Main {
        /*
         * Customer class
         */
        public class Customer {
            private String lastName;
            private String firstName;
            private Integer age;

            public Customer() {}

            public Customer(String firstName, String lastName, Integer age) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
            }

            public Integer getAge() {
                return age;
            }

            public String getLastName() {
                return lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            @Override
            public String toString() {
                return firstName + "" + lastName + "" + age;
            }
        }

        /*
         * Sample Solution 1: Pre-Java8 sort using Collections sort and custom comparator
         */
        public List<Customer> sortByAgeThenLastThenFirst() {

            /*
             * to be filled by the candidate..........
             */



            return null;
        }

        /*
         * Sample Solution 1: TestForInterview for Custom Comparator
         */

        public static class CustomerComparator implements Comparator<Customer> {

            @Override
            public int compare(Customer c1, Customer c2) {
                /*
                 * to be filled by the candidate..........
                 */
                if (c1.age == c2.age) {
                    if (c1.lastName == c2.lastName)
                    {
                        return c1.firstName.compareTo(c2.firstName);
                    }
                    else

                        return c1.lastName.compareTo(c2.lastName);
                }

                return c1.age - c2.age;

            }
        }

        /*
         * Sample Solution 2: Immutable sort using Streams.sorted
         */
        public List<Customer> sortByAgeThenLastThenFirstUsingStreams() {
            /*
             * to be filled by the candidate..........
             */
            return null;
        }

        /*
         * Sample data set
         */
        private List<Customer> customers = Arrays.asList(
        );

        /*
         * Expected result set
         */
        private List<Customer> sortedCustomers = Arrays.asList(
        );

        public static void main(String[] args) {
            Main m=new Main();
            CustomerComparator customerComparator = new CustomerComparator();
            Collections.sort(m.customers1, customerComparator);
            for (Customer customer :m.customers1) {
                System.out.println(customer.firstName +" "+ customer.lastName + " "+customer.age);
            }
        }


        // Sample data set
        List<Customer> customers1 = Arrays.asList(
                new Customer("Jack", "Nicklaus", 68),
                new Customer("Tiger", "Woods", 70),
                new Customer("Tom", "Watson", 70),
                new Customer("Ty", "Webb", 68),
                new Customer("Bubba", "Watson", 70)
        );


        // Expected result set
        private List<Customer> expectedList = Arrays.asList(
                new Customer("Jack", "Nicklaus", 68),
                new Customer("Ty", "Webb", 68),
                new Customer("Bubba", "Watson", 70),
                new Customer("Tom", "Watson", 70),
                new Customer("Tiger","Woods", 70)
        );
    }
}
