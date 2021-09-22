package Calc;

import java.util.Scanner;

public class Calc {

    public int calc(int a, int b, String c) {
        boolean isNum = false;
        int result = 0;
        if (c.equals("+")) {
            result = a + b;
            isNum = true;
        } else if (c.equals("-")) {
            result = a - b;
            isNum = true;
        } else if (c.equals("*")) {
            result = a * b;
            isNum = true;
        } else if (c.equals("/")) {
            result = a / b;
            isNum = true;
        } else isNum = false;
        return result;
    }

};
