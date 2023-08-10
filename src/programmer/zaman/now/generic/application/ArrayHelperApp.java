package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.ArrayHelper;

public class ArrayHelperApp {
  public static void main(String[] args) {

    String[] names = {"Eko", "Kurniawan", "Khannedy"};
    Integer[] numbers = {1, 2, 3, 4, 5};

    System.out.println(
//        kalau udah deklarasi genericnya adalah string, jangan pulak dimasukkin datanya integer karna pasti bakal error
        ArrayHelper.<String>count(names)
    );

    System.out.println(
        ArrayHelper.count(numbers)
    );

  }
}
