package Employee;

public abstract class Employee implements IEmployee {

    int paymentPerHour;


    String name;

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

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

}
