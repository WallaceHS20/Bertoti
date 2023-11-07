package Composite;

public class Application {
    public static void main(String[] args) {
        Employee john = new IndividualEmployee("John");
        Employee jane = new IndividualEmployee("Jane");

        Department hrDepartment = new Department("HR Department");
        hrDepartment.addEmployee(john);
        hrDepartment.addEmployee(jane);

        Employee alice = new IndividualEmployee("Alice");
        Employee bob = new IndividualEmployee("Bob");

        Department itDepartment = new Department("IT Department");
        itDepartment.addEmployee(alice);
        itDepartment.addEmployee(bob);

        Department company = new Department("Our Company");
        company.addEmployee(hrDepartment);
        company.addEmployee(itDepartment);

        company.showDetails();
    }
}
