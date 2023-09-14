package Employee;

public class EmployeeProgram {

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[10];

        employeeList[1] = new FullTimeEmployee("James", 8);
        employeeList[2] = new FullTimeEmployee("Mike", 8);
        employeeList[3] = new FullTimeEmployee("Jake", 8);
        employeeList[4] = new FullTimeEmployee("Hannah", 8);
        employeeList[5] = new FullTimeEmployee("Sophia", 8);
        employeeList[6] = new PartTimeEmployee("Christ", 8, 4 );
        employeeList[7] = new PartTimeEmployee("Rose", 8, 5 );
        employeeList[8] = new PartTimeEmployee("Timmy", 8, 3 );
        employeeList[9] = new PartTimeEmployee("Tyson", 8, 6 );
        employeeList[0] = new PartTimeEmployee("Ryan", 8, 2 );
    }
}
