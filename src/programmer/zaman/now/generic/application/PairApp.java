package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Pair;

public class PairApp {
  public static void main(String[] args) {

    //contoh pembuatan multiple general object
    Pair<String, Integer> pair = new Pair<String, Integer>("eko", 100);
    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());

  }
}
