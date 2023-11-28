package LearnCallback;

public class CalculatorProgram {

    static CalculationCallback calculationCallback = new CalculationCallback() {
        @Override
        public void onCalculationComplete(int result) {
            System.out.println("Tong la: "+ result);
        }
    };

    public static void main(String[] args) {
         int x = 5;
         int y = 10;
         Calculator calculator = new Calculator();
         calculator.add(x, y, calculationCallback);

         calculator.add(20, 40, new CalculationCallback() {
             @Override
             public void onCalculationComplete(int result) {
                 System.out.println("Sum is: " +result);
             }
         });
    }


}
