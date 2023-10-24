package employee;

public class PartTimeEmployee extends Employee {

    int workingHours;

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(String name, Gender gender, int paymentPerHour, int workingHours) {
        super(name, gender, paymentPerHour);
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary(){
        return paymentPerHour*workingHours;
    };
}
