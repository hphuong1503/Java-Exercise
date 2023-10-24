package employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrint implements Printable{

    @Override
    public void printEmployeeList(Employee[] employeeList, int numOfEmployee)  {

        try {
            File file = new File("employee.txt");

            if (file.exists()) {
                System.out.println("File da ton tai, co the su dung");
            } else {
                System.out.println("File chua ton tai");
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);

            for (int i = 0; i < numOfEmployee; i++){
                writer.write(employeeList[i].getName()+" "+employeeList[i].getPaymentPerHour()+" "+employeeList[i].calculateSalary());
                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
