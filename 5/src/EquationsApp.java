public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=cos(x)/tg(2x)  = " + calc.doCalculation(100));
        System.out.println("  y=cos(x)/tg(2x)  = " + calc.doCalculation(70));
       
        System.out.println("  y=cos(x)/tg(2x)  = " + calc.doCalculationWithInputInside());
        System.out.println("  y=cos(x)/tg(2x)  = " + calc.doCalculationWithInputInside());
    }
}
