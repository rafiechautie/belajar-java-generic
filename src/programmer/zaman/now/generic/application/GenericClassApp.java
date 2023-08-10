package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericClassApp {
  public static void main(String[] args) {

    //pembuatan generic object
    MyData<String> stringMyData = new MyData<String>("Eko");
    //MyData<String> stringMyData = new MyData<String>(10); //error pada saat compile
    MyData<Integer> integerMyData = new MyData<Integer>(10);

    String stringValue = stringMyData.getData();
    Integer integerValue = integerMyData.getData();

    System.out.println(stringValue);
    System.out.println(integerValue);

  }
}
