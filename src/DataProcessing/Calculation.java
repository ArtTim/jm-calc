package DataProcessing;

import Input.ConsoleScan;
import Input.ScannerException;

public class Calculation {

    public void calc() throws ScannerException, CalculationException {
        ConsoleScan scan = new ConsoleScan();
        Convertation conv = new Convertation();
        scan.req();
        String a = scan.a;
        String b = scan.b;
        String c = scan.c;
        int result = 0;

        if (c.equals("+")) {
            result = Integer.valueOf(a) + Integer.valueOf(b);
        } else if (c.equals("-")) {
            result = Integer.valueOf(a) - Integer.valueOf(b);
        } else if (c.equals("*")) {
            result = Integer.valueOf(a) * Integer.valueOf(b);
        } else if (c.equals("/")) {
            result = Integer.valueOf(a) / Integer.valueOf(b);
        }

        if (scan.isRomanian) {
            if (result <= 0) {
                throw new CalculationException("throws Exception //т.к. в римской системе нет отрицательных чисел");
            } else {
                System.out.println(conv.toRomanian(result));
            }
        } else {
            System.out.println(result);
        }
    }

};
