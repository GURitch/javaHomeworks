package IntroductionAndSyntax.courseWork1;

public class EmployeeBook {
    private final Employee[] employees;
    private int count;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void addEmployee(String fullName, int department, int salary){
        if(count == employees.length){
            System.out.println("Нельзя добавить сотрудника, штат полон");
        } else {
            Employee employee = new Employee(fullName, department, salary);
            employees[count] = employee;
            System.out.println("ДОБАВЛЕН "+employees[count].toString());
            count++;
        }
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.println("УДАЛЕН "+employees[i].toString());
                System.arraycopy(employees, i + 1, employees, i, count - i - 1);
                employees[count - 1] = null;
                count--;
                return;
            }
        }
    }

    public void printAllEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
