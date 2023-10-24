package employee;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, Gender gender, int paymentPerHour) {
        super(name, gender, paymentPerHour);
    }

    public FullTimeEmployee(String name, int paymentPerhour) {
        super(name, paymentPerhour);
    }

    @Override
    public int calculateSalary() {
        return 8*paymentPerHour;
    }
}
