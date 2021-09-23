import DataProcessing.Calculation;
import DataProcessing.CalculationException;
import Input.ScannerException;

public class Main {

    public static void main(String[] args) throws ScannerException, CalculationException {
        Calculation calc = new Calculation();
        calc.calc();

//        else {
//            scan.req();
//            try {
//                if (scan.a < 1 || scan.a > 10 || scan.b < 1 || scan.b > 10) {
//                    throw new IOException();
//                }  else {
//                    Calc calc = new Calc();
//                    System.out.println("Результат запроса: " + calc.calc(scan.a, scan.b, scan.c));
//                }
//            } catch (IOException e) {
//                System.err.println("throws Exception // Ожидаются цифры от 1 до 10");
//            }
//        }
    }
}

