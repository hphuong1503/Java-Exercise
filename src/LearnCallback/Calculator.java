package LearnCallback;

public class Calculator {

    public void add(int a, int b, CalculationCallback calculationCallback){
        int sum = a+b;
        calculationCallback.onCalculationComplete(sum);
    }

}


