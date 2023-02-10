package IntroductionAndSyntax.courseWork1;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee("Иванов Иван Иванович", 1, 30_000);
        employeeBook.addEmployee("Артемов Артем Артемович", 1, 40_000);
        employeeBook.addEmployee("Борисов Борис Борисович", 2, 45_000);
        employeeBook.addEmployee("Николаев Николай Николаевич", 2, 50_000);
        employeeBook.addEmployee("Антонов Антон Антонович", 3, 60_000);
        employeeBook.addEmployee("Александров Александр Александрович", 3, 65_000);
        employeeBook.addEmployee("Алексеев Алексей Алексеевич", 4, 70_000);
        employeeBook.addEmployee("Максимов Максим Максимович", 4, 75_000);
        employeeBook.addEmployee("Кириллов Кирилл Кириллович", 5, 80_000);
        employeeBook.addEmployee("Игорев Игорь Игорьевич", 5, 90_000);
        System.out.println();

        employeeBook.addEmployee("Антонов Антон Антонович", 1, 60_000);
        System.out.println();

        employeeBook.deleteEmployeeById(3);
        System.out.println();

        employeeBook.addEmployee("Егоров Егор Егорович", 2, 40_000);
        System.out.println();

        employeeBook.printAllEmployees();
        System.out.println();

        Employee maxSalary = employeeBook.searchMaxSalary();
        System.out.println("Самую большую зарплату имеет " + maxSalary.toString());
        System.out.println();

        Employee minSalary = employeeBook.searchMinSalary();
        System.out.println("Самую маленькую зарплату имеет " + minSalary.toString());
        System.out.println();

        employeeBook.printFullName();
        System.out.println();

        System.out.println("Сумма затрат на зарплату сотрудникам: " + employeeBook.calculateSumSalary() + " руб");
        System.out.println();

        System.out.println("Среднее значение зарплат: " + employeeBook.calculateAverageSalary() + " руб");
        System.out.println();

        employeeBook.indexationSalary(-10);
        employeeBook.printAllEmployees();
        System.out.println();

        System.out.println("Максимальную зарплату в отделе: 5, имеет " + employeeBook.searchMaxSalaryByDepartment(5));
        System.out.println();

        System.out.println("Минимальную зарплату в отделе: 2, имеет " + employeeBook.searchMinSalaryByDepartment(2));
        System.out.println();

        System.out.println("Сумма затрат на зарплату сотрудникам в отделе: 1, составляет " + employeeBook.calculateSumSalaryByDepartment(1) + " руб");
        System.out.println();

        System.out.println("Среднее значение зарплат сотрудников в отделе: 3, составляет " + employeeBook.calculateAverageSalaryByDepartment(3) + " руб");
        System.out.println();

        employeeBook.indexationSalaryByDepartment(1, 10);
        System.out.println();

        employeeBook.printAllEmployeesByDepartment(1);
        System.out.println();

        employeeBook.printSortBySpecifiedSalary(50000);
        System.out.println();

        employeeBook.printSortEmployeesByDepartment(5);
        System.out.println();

        employeeBook.changeEmployeeByName("Иванов Иван Иванович",5,48000);
    }
}
