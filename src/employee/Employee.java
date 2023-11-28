package employee;

public abstract class Employee implements IEmployee {

    int paymentPerHour;

    Gender gender;

    String name;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public Employee(String name, Gender gender, int paymentPerHour) {
        this.gender = gender;
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }


}
