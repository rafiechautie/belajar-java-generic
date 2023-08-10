package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
  public static void main(String[] args) {

    MyData<Object> objectMyData = new MyData<>("Eko");
    objectMyData.setData(1000);

    //deklarasi contravariant 1
    MyData<? super String> myData = objectMyData;

    process(objectMyData);

    System.out.println(objectMyData.getData());
  }

  //deklarasi contravariant 2
  public static void process(MyData<? super String> myData){
    //harus tipe datanya object dikarenakan parameter yang diinput yaitu myData bertipe data object, sehingga bisa iinput apapun
    Object value = myData.getData();
    System.out.println("Process parameter " + value);

    myData.setData("Eko Kurniawan");
  }
}
