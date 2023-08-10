package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class TypeErasureApp {
  public static void main(String[] args) {

    //contoh type erasure dengan menghilangkan generic typenya.
    MyData myData = new MyData("Eko");
    //contoh tidak dihilangkan type erasurenya
//    MyData <String> myData = new <String> MyData("Eko"); //jika type erasure tidak dilakukan, maka errornya pasti akan ketauan

    //errornya tidak ketahuan karena type erasurenya dihilangkan, padahal parameter input di MyDatanya string,harusnya jika di run maka akan error
    MyData<Integer> integerMyData = (MyData<Integer>) myData;
    Integer integer = integerMyData.getData();

  }
}
