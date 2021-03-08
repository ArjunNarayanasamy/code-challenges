package designpatterns.creational.builder;

public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNo;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.address = employeeBuilder.address;
        this.phoneNo = employeeBuilder.phoneNo;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "Employee{"+
                "id="+id+
                ", firstName="+firstName+
                ", lastName="+lastName+
                ", age="+age+
                ", address="+address+
                ", phoneNum="+phoneNo+"}";
    }

    public static class EmployeeBuilder {
        private String id;
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNo;

        public EmployeeBuilder(final String id, final String firstName, final String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public EmployeeBuilder withOptionalAge(final int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder withOptionalAddress(final String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder withOptionalPhoneNo(final String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Employee buildEmployee() {
            isValidateEmployeeData();
            return new Employee(this);
        }

        private boolean isValidateEmployeeData() {
            //do any validations
            return true;
        }
    }
}
