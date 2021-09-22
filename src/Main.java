import Calc.Calc;
import Input.ConsoleScan;
import Input.ScannerException;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ScannerException {
        System.out.println("Введите запрос арифметической операции:");
        ConsoleScan scan = new ConsoleScan();
        if (scan.splitScan.length < 3) {
            throw new ScannerException("throws Exception //т.к. строка не является математической операцией");
        } else if (scan.splitScan.length > 3) {
            throw new ScannerException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            scan.req();
            if (scan.a < 1 || scan.a > 10 || scan.b < 1 || scan.b > 10) {
                throw new ScannerException("throws Exception // Ожидаются цифры от 1 до 10");
            } else {
                Calc calc = new Calc();
                System.out.println("Результат запроса: " + calc.calc(scan.a, scan.b, scan.c));
            }
        }


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

