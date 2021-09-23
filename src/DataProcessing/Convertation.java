package DataProcessing;

public class Convertation {

    public String toArabian(String a) {
      int x = 0;
      for (int i = 0; i < Number.values().length; i++) {
          if (a.matches(String.valueOf(Number.values()[i]))) {
              x = Number.values()[i].getConvertation();
          }
      }
    return String.valueOf(x);
    }
    public Number toRomanian(int a) {
        Number str = Number.I;
        if (a < 10 || a == 10 || a == 20 || a == 30 || a == 40 || a == 50 || a == 60 || a == 70 || a == 80 || a == 90 || a == 100) {
            for (int i = 0; i <= Number.values().length - 1; i++) {
                if (Number.values()[i].getConvertation() == a) {
                    System.out.println(Number.values()[i].getConvertation());
                    str = Number.values()[i];
                }
            }
            System.out.println("Сработало это условие");
        } else { // TODO: 24.09.2021 Доделать конвертацию результата 
            String intString = String.valueOf(a);
            System.out.println("Строка: " + intString);
            String[] newString =  intString.split("");
            StringBuffer newStr = new StringBuffer();
            newStr.append(str);
            for (int i = 0, x = 0; i <= Number.values().length - 1; i++) {
                if ((a - a % 10) == Number.values()[i].getConvertation()) {
                    System.out.println(Number.values()[i]);
                    str = Number.values()[i];
                    newStr.append(newString[1]);
                    System.out.println("New: " + newStr);
                    x++;

                }

            }

        }
        return str;
    }
}
