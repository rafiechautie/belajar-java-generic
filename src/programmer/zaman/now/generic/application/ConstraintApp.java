package programmer.zaman.now.generic.application;

public class ConstraintApp {
  public static void main(String[] args) {

    NumberData<Integer> integerNumberData = new NumberData<>(1);
    NumberData<Long> longNumberData = new NumberData<>(1L);

    // NumberData<String> stringNumberData = new NumberData<String>("Eko"); // ERROR karena yang dibolehnkan hanya turunan class NUMBER

  }


  //hanya kelas turunan number yang boleh masuk ke generic Type
  public static class NumberData<T extends Number>{

    private T data;

    public NumberData(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }
}
