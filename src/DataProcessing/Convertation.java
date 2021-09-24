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
    public StringBuffer toRomanian(int a) {
        Number str = Number.I;
        StringBuffer numString = new StringBuffer();
        // Если число меньше десяти, или кратно 10
        if (a < 10 || a == 10 || a == 20 || a == 30 || a == 40 || a == 50 || a == 60 || a == 70 || a == 80 || a == 90 || a == 100) {
            for (int i = 0; i <= Number.values().length - 1; i++) {
                if (Number.values()[i].getConvertation() == a) {
                    numString.append(String.valueOf(Number.values()[i]));
                }
            }
        } else { //
            String intString = String.valueOf(a);

            String[] newString =  intString.split("");
            for (int i = 0; i <= Number.values().length - 1; i++) {
                if ((a - a % 10) == Number.values()[i].getConvertation()) {
                    numString.append(String.valueOf(Number.values()[i]));
                }

            }
            for (int i = 0; i <= Number.values().length - 1; i++) {
                if (Integer.valueOf(newString[1]) == Number.values()[i].getConvertation()) {
                    numString.append(String.valueOf(Number.values()[i]));
                }
            }
        }
        return numString;
    }
}
