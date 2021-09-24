package Input;

import DataProcessing.Convertation;
import DataProcessing.Validation;
import java.util.Scanner;

public class ConsoleScan {
    Validation validation = new Validation();
    Convertation conv = new Convertation();
    public String a, b, c;
    public boolean isArabian, isRomanian;

    // Запрос ввода в консоль
    public void req() throws ScannerException {
        System.out.println("Введите арифметический запрос: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] splitScan = str.split(" ");

        a = splitScan[0];
        b = splitScan[2];
        c = splitScan[1];

        // Валидация введённых данных
        if (splitScan.length > 3) { //т.к. строка не является математической операцией
            throw new ScannerException("throws Exception //т.к. строка не является математической операцией");
        } else if (splitScan.length < 3) { //т.к. формат математической операции не удовлетворяет заданию
            throw new ScannerException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            if (validation.consoleValid(a,b,c) == 1) { // Если римские
                a = conv.toArabian(a);
                b = conv.toArabian(b);
                isRomanian = true;
//                System.out.println("Введены римские цифры");
//                System.out.println(a + " " + c + " " + b);
            } else if (validation.consoleValid(a,b,c) == 2) { // Если арабские
                a = splitScan[0];
                b = splitScan[2];
                isArabian = true;
            } else {
                throw new ScannerException("throws Exception //т.к. используются одновременно разные системы счисления");
            }
        }

    }
}
