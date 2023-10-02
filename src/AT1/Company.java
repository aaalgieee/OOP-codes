package AT1;

    import java.util.Scanner;

    public class Company {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Manager manager = new Manager();
            System.out.print("Enter manager name: ");
            manager.setName(scanner.nextLine());
            System.out.print("Enter manager employee number: ");
            manager.setEmployeeNumber(scanner.nextInt());
            System.out.print("Enter manager basic salary: ");
            manager.setBasicSalary(scanner.nextDouble());
            System.out.print("Enter manager allowance: ");
            manager.setAllowance(scanner.nextDouble());

            SalesPerson salesperson = new SalesPerson();
            System.out.print("Enter salesperson name: ");
            scanner.nextLine(); 
            salesperson.setName(scanner.nextLine());
            System.out.print("Enter salesperson employee number: ");
            salesperson.setEmployeeNumber(scanner.nextInt());
            System.out.print("Enter salesperson basic salary: ");
            salesperson.setBasicSalary(scanner.nextDouble());
            System.out.print("Enter salesperson commission: ");
            salesperson.setCommission(scanner.nextDouble());

            Secretary secretary = new Secretary();
            System.out.print("Enter secretary name: ");
            scanner.nextLine(); 
            secretary.setName(scanner.nextLine());
            System.out.print("Enter secretary employee number: ");
            secretary.setEmployeeNumber(scanner.nextInt());
            System.out.print("Enter secretary basic salary: ");
            secretary.setBasicSalary(scanner.nextDouble());

            manager.computeSalary();
            salesperson.computeSalary();
            secretary.computeSalary();

            System.out.println();
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

            scanner.close();
        }
    }
