package Employee;

public abstract class Employee implements IEmployee {

    int paymentPerHour;

    String name;

    public void getName(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public String getName() {
        return null;
    }
}
