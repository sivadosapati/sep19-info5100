/**
 * Complete all TODO
 * Submit before 22nd September 12:00pm
 */
public class Assignment2 {
    private static final String ORGANISATION = "Northeastern";
    private static final String[] STRS = new String[] {
            //firstname,lastname,age,salary,email,designation
            "John,Doe,24,5400,johndoe@gmail.com,Engineer",
            "Sara,Jones,26,6300,sarajones@gmail.com,TechnicalRecruiter",
            "Noah,Trevor,32,5300,noahtrevor@gmail.com,Writer",
            "Jill,Meyer,34,6800,jillmeyer@gmail.com,Manager",
            "Chris,Strat,36,7600,chrisstrat@gmail.com,Director",
            "Ching,Chi,25,4000,chingchi@gmail.com,Developer",
            "Yue,Hui,28,4900,yuehui@gmail.com,Tester",
            "Amit,Agarwal,27,5700,yuehui@gmail.com,SeniorDeveloper",
            "Tianyu,Wang,26,4500,tianyuwang@gmail.com,Researcher",
            "Ram,Menon,29,5700,rammenon@gmail.com,DataScientist"
    };

    private final Employee[] employees = new Employee[10];

    class Employee implements Comparable<Employee> {
        private String firstName;
        private String lastName;
        private int age;
        private int salary;
        private String email;
        private String designation;
        private String org;

        Employee(String firstName, String lastName, int age, int salary, String email, String designation, String org) {
            // @TODO
            // initialize all members here
        }

        // generate getter setters for all Employee members

        @Override
        public int compareTo(Employee o) {
            // @TODO
            // compare employee by their salary, if salaries are equal, compare by age
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            // @TODO
            // implement equals for Employee
            return true;
        }

        @Override
        public int hashCode() {
            // @TODO
            // implement hashcode for employee
            return 0;
        }
    }

    public void initializeEmployees() {
        // @TODO
        // use STRS to create employee objects and store them in employees array
    }

    public int sumOfSalariesGreaterThanFiveThousands() {
        // @TODO
        // calculate the sum of salaries of employees having salary greater than 5000
        return 0;
    }

    public void swapSalaries() {
        // @TODO
        // swap salary of even numbered employee with odd numbered employee
        // swap salary of employees[0] with employees[1], employees[2] with employees[3] and so on..
    }

    public void customSort() {
        // @TODO
        // sort employees array on the basis of firstName and print
        for(Employee employee : employees) {
            System.out.println(employee.firstName);
        }

        // @TODO
        // sort employees array on the basis of age and print

        for(Employee employee : employees) {
            System.out.println(employee.firstName);
        }
    }

    public static void main(String[] args) {
        Assignment2 assignment2 = new Assignment2();
        // you can verify/test your code here
    }

}
