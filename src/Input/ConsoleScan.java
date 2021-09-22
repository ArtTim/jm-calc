package Input;

import Calc.Calc;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleScan {

    Scanner scan = new Scanner(System.in);
    public int a, b;
    public String c;
    public String str = scan.nextLine();
    public String[] splitScan = str.split(" ");

    public String req() {
        c = String.valueOf(splitScan[1]);

        if (splitScan[0].matches("[0-9]{1,2}") && splitScan[2].matches("[0-9]{1,2}")) {
            a = Integer.valueOf(splitScan[0]);
            b = Integer.valueOf(splitScan[2]);
        } else if (splitScan[0].matches("[A-Za-z]") && splitScan[2].matches("[A-Za-z]")) {
            String a = splitScan[0];
            String b = splitScan[2];
            System.out.println("Первый операнд: " + a + "; Второй операнд: " + b + "; Операция: " + c);
        }
        return str;
    }


}
