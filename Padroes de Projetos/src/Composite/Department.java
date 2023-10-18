package Composite;

public class Department implements OrganizationalUnit{
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Departamento: " + name);
    }
}
