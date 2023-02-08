package IntroductionAndSyntax.courseWork1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(5);

        employeeBook.addEmployee("Иванов",1,30_000);
        employeeBook.addEmployee("Артемов",1,30_000);
        employeeBook.addEmployee("Борисов",1,30_000);
        employeeBook.addEmployee("Иванов",1,30_000);
        employeeBook.addEmployee("Иванов",1,30_000);
        System.out.println();

        employeeBook.printAllEmployees();
        System.out.println();

        employeeBook.deleteEmployeeById(3);
        System.out.println();

        employeeBook.printAllEmployees();
        System.out.println();

        employeeBook.addEmployee("Егоров",1,30_000);
        System.out.println();
        employeeBook.printAllEmployees();

    }
}
