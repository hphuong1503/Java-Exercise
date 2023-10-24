package employee;

public class ConsolePrint implements Printable {

    @Override
    public void printEmployeeList(Employee[] employeeList, int numOfEmployee) {
        for (int i = 0; i < numOfEmployee; i++) {
            System.out.println(employeeList[i].getName() + ":" + " " + employeeList[i].calculateSalary());
        }
    }
}
