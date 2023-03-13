package _1_introductionAndSyntax.courseWork;

class EmployeeBook {
    private final Employee[] employees;
    private int count;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void addEmployee(String fullName, int department, int salary) {
        if (count == employees.length) {
            System.out.println("Нельзя добавить сотрудника, штат полон");
        } else {
            Employee employee = new Employee(fullName, department, salary);
            employees[count] = employee;
            System.out.println("ДОБАВЛЕН " + employees[count].toString());
            count++;
        }
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.println("УДАЛЕН " + employees[i].toString());
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

    public Employee searchMaxSalary() {
        Employee maxSalary = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    public Employee searchMinSalary() {
        Employee minSalary = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() < minSalary.getSalary()) {
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public void printFullName() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public int calculateSumSalary() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public int calculateAverageSalary() {
        return calculateSumSalary() / count;
    }

    public void indexationSalary(int percent) {
        for (int i = 0; i < count; i++) {
            employees[i].setSalary((int) ((1.0 * percent / 100 + 1) * employees[i].getSalary()));
        }
        System.out.println("Произведена индексация зарплат всех сотрудников на: " + percent + "%");
    }

    public Employee searchMaxSalaryByDepartment(int department) {
        Employee maxSalary = null;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment() == department) {
                if (maxSalary == null || employees[i].getSalary() < maxSalary.getSalary()) {
                    maxSalary = employees[i];
                }
            }
        }
        return maxSalary;
    }

    public Employee searchMinSalaryByDepartment(int department) {
        Employee minSalary = null;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment() == department) {
               if (minSalary == null || employees[i].getSalary() < minSalary.getSalary()) {
                   minSalary = employees[i];
               }
            }
        }
        return minSalary;
    }

    public int calculateSumSalaryByDepartment(int department) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public int calculateAverageSalaryByDepartment(int department) {
        int employeesInDepartment = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment() == department) {
                employeesInDepartment++;
            }
        }
        return calculateSumSalaryByDepartment(department) / employeesInDepartment;
    }

    public void indexationSalaryByDepartment(int department, int percent) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary((int) ((1.0 * percent / 100 + 1) * employees[i].getSalary()));
            }
        }
        System.out.println("Произведена индексация зарплат сотрудников в отделе: " + department + ", на: " + percent + "%");
    }

    public void printAllEmployeesByDepartment(int department) {
        int countEmployee = 0;
        System.out.println("Список сотрудников отела: " + department);
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник: " + employees[i].getFullName() + ", ID: " + employees[i].getId() + ", Зарплата: " + employees[i].getSalary() + " руб");
                countEmployee++;
            }
        }
        if (countEmployee == 0) {
            System.out.println("В отделе нет сотрудников, или отдела " + department + " не существует");
        }
    }

    public void printSortBySpecifiedSalary(int salary) {
        System.out.println("Сотрудники с зарплатой менее " + salary + " руб:");
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("Сотрудник: " + employees[i].getFullName() + ", ID: " + employees[i].getId() + ", Зарплата: " + employees[i].getSalary() + " руб");
            }
        }
        System.out.println();
        System.out.println("Сотрудники с зарплатой равной или более " + salary + " руб:");
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println("Сотрудник: " + employees[i].getFullName() + ", ID: " + employees[i].getId() + ", Зарплата: " + employees[i].getSalary() + " руб");
            }
        }
    }

    public void printSortEmployeesByDepartment(int theNumberOfAllDepartments) {
        int department = 1;
        while (department <= theNumberOfAllDepartments) {
            System.out.println("Сотрудники отдела " + department + ":");
            for (int i = 0; i < count; i++) {
                if (employees[i].getDepartment() == department) {
                    System.out.println(employees[i].getFullName());
                }
            }
            department++;
            System.out.println();
        }
    }

    public void changeEmployeeByName(String fullNameEmployee, int newDepartment, int newSalary) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getFullName().equals(fullNameEmployee)) {
                System.out.println("У сотрудника " + employees[i].getFullName() + " были изменены:" + '\n' +
                        "отдел - с " + employees[i].getDepartment() + " на " + newDepartment + '\n' +
                        "зарплата - с " + employees[i].getSalary() + " руб на " + newSalary + " руб");
                employees[i].setDepartment(newDepartment);
                employees[i].setSalary(newSalary);
            }
        }
    }
}

