package Employee;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeProgram {

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[50];

        employeeList[0] = new FullTimeEmployee("Ryan", 8);
        employeeList[1] = new FullTimeEmployee("James", 8);
        employeeList[2] = new FullTimeEmployee("Mike", 8);
        employeeList[3] = new FullTimeEmployee("Jake", 8);
        employeeList[4] = new FullTimeEmployee("Hannah", 8);
        employeeList[5] = new PartTimeEmployee("Sophia", 8, 1);
        employeeList[6] = new PartTimeEmployee("Christ", 8, 12);
        employeeList[7] = new PartTimeEmployee("Rose", 8, 10);
        employeeList[8] = new PartTimeEmployee("Timmy", 8, 11);
        employeeList[9] = new PartTimeEmployee("Tyson", 8, 2);

        boolean condition = true;
        int numOfEmployee = 10;
        Scanner scanner = new Scanner(System.in);

        while (condition){
            System.out.println("1: In ra tat ca Employee");
            System.out.println("2: In ra Employee co luong tren $20");
            System.out.println("3: In ra 5 Employee co luong cao nhat");
            System.out.println("4: Search vi tri ten Employee");
            System.out.println("5: Search ky tu");
            System.out.println("6: Add Employee");
            switch (scanner.nextInt()){
                case 1: printAllEmployee(employeeList, numOfEmployee); break;
                case 2: listEmployeeOverTwenty(employeeList); break;
                case 3: printFiveHighestSalary(employeeList); break;
                case 4: findEmployeeByName(employeeList); break;
                case 5: findEmployeeByLetter(employeeList); break;
                case 6: addNewEmployee(employeeList, numOfEmployee); numOfEmployee++; break;
            }
            System.out.println("Continue? (y/n)");
            if (scanner.next().equals("n")){
                condition = false;
            }
        }
    }

    private static void printAllEmployee(Employee employeeList[], int numOfEmpoyee) {
        for (int i = 0; i < numOfEmpoyee; i++) {
            System.out.println(employeeList[i].getName() + ":" + " " + employeeList[i].calculateSalary());
        }
    }
    static void findEmployeeByName(Employee employeeList[]) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten Employee de search: ");
        name = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            if (employeeList[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Vi tri cua "+name+" la thu: " + (i + 1));
                return;
            }
        }
        System.out.println("Khong co employee ten: "+name);

    }
    static void printFiveHighestSalary(Employee employeeList[]){
        Employee[] arr;
        arr = employeeList.clone();
        Employee highestEmp = null;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[j + 1].calculateSalary() > arr[j].calculateSalary()) {
                    highestEmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = highestEmp;
                }
            }
        }
        System.out.println("List nguoi co luong cao nhat:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].getName());
        }
    }
    static void listEmployeeOverTwenty(Employee employeeList[]){
        System.out.println("List nguoi co luong cao hon $20");
        for (int i = 0; i < 10; i++) {
            if (employeeList[i].calculateSalary() > 20) {
                System.out.println(employeeList[i].getName() + " co luong cao hon $20" + " " + "(" + employeeList[i].calculateSalary() + ")");
            }
        }
    }

    static void findEmployeeByLetter(Employee employeeList[]) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap de search: ");
        name = scanner.nextLine();
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (employeeList[i].getName().contains(name)) {
                System.out.println(employeeList[i].getName()+": "+employeeList[i].calculateSalary());
                num++;
            }
        }
        System.out.println("Co "+num+" nguoi duoc tim thay");
    }

    static void addNewEmployee(Employee employeeList[], int numOfEmployee){
        Scanner scanner = new Scanner(System.in);
        String name;
        Employee employee;
        int pay;
        int workingHours;
        System.out.println("1: Add full time employee");
        System.out.println("2: Add part time employee");
        switch (scanner.nextInt()){
            case 1: System.out.println("Nhap ten Employee: ");
                name = scanner.next();
                System.out.println("Nhap luong mot gio: ");
                pay = scanner.nextInt();
                employee = new FullTimeEmployee(name, pay);
                employeeList[numOfEmployee] = employee;
                break;

            case 2: System.out.println("Nhap ten Employee: ");
                name = scanner.next();
                System.out.println("Nhap luong mot gio: ");
                pay = scanner.nextInt();
                System.out.println("Nhap tong gio luong viec");
                workingHours = scanner.nextInt();
                employee = new PartTimeEmployee(name, pay, workingHours);
                employeeList[numOfEmployee] = employee;
                break;
        }
}



}


