package AT1;

public class Company {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("John Doe");
        manager.setEmployeeNumber(12345);
        manager.setBasicSalary(10000);
        manager.setAllowance(2000);

        SalesPerson salesperson = new SalesPerson();
        salesperson.setName("Jane Doe");
        salesperson.setEmployeeNumber(67890);
        salesperson.setBasicSalary(7000);
        salesperson.setCommission(500);

        Secretary secretary = new Secretary();
        secretary.setName("Mary Smith");
        secretary.setEmployeeNumber(23456);
        secretary.setBasicSalary(5000);


        manager.computeSalary();
        salesperson.computeSalary();
        secretary.computeSalary();


        System.out.println("Manager:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee Number: " + manager.getEmployeeNumber());
        System.out.println("Basic Salary: " + manager.getBasicSalary());
        System.out.println("Allowance: " + manager.getAllowance());
        System.out.println("Salary: " + manager.getSalary());

        System.out.println("\nSalesperson:");
        System.out.println("Name: " + salesperson.getName());
        System.out.println("Employee Number: " + salesperson.getEmployeeNumber());
        System.out.println("Basic Salary: " + salesperson.getBasicSalary());
        System.out.println("Commission: " + salesperson.getCommission());
        System.out.println("Salary: " + salesperson.getSalary());

        System.out.println("\nSecretary:");
        System.out.println("Name: " + secretary.getName());
        System.out.println("Employee Number: " + secretary.getEmployeeNumber());
        System.out.println("Salary: " + secretary.getBasicSalary());
    }
}
