package designpatterns.creational.builder;

public class BuilderTester {

    public Employee getEmployee() {
        return new Employee.EmployeeBuilder("101", "Arjun", "Narayanasamy")
                .withOptionalAddress("Chennai")
                .withOptionalAge(27)
                .buildEmployee();
    }

    public static void main(String[] args) {
        BuilderTester builderTester = new BuilderTester();
        System.out.println(builderTester.getEmployee());
    }
}
