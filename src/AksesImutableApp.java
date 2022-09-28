import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AksesImutableApp {

  public static void main(String[] args) {
    ImutableApp imutableApp = new ImutableApp("fajar");
    imutableApp.addHobby("fishing");
    imutableApp.addHobby("swimming Pool");
    imutableApp.addHobby("playing football");
    System.out.println("my name is : "+imutableApp.getName());
    System.out.println("my hobbies is : ");
    // doSomeThinkWithHobbies(imutableApp.getHobbies());//ilegal memasukan ke dalam list
    for (var hobi : imutableApp.getHobbies()){
      System.out.println(hobi);
    }


    /*
    ini membuat imutable list dengan list yang kosong(kita bisa menambahkan beberapa list di dalamnya)
     List<String> one = Collections.emptyList();
    one.add("fajar");
    one.add("abdillah");
    one.add("ahmad");
    for (var i : one){
      System.out.println(i);
    }

     */


    /*
    Ini adalah imutable list pada 1 data saja


    List<String> list = Collections.singletonList("test");
    System.out.println(list);
    */

    /*
    List<Object> objectList = new ArrayList<>();
    objectList.add("fajar");
    objectList.add("nisa");
    objectList.add("ujeh");
    objectList.add("uyen");
    for (var x : objectList){
      System.out.println(x);
    }
    List<Object> imutableObject = Collections.unmodifiableList(objectList);
    System.out.println(imutableObject);//akan mencetak data array yang ada di mutable
    // di bawah ini error bila dijalankan
    imutableObject.add("sandi");
    for (var y : imutableObject){
      System.out.println(y);
    }

     */


    /*
    di bawah ini membuat immutable 1 per 1 (elemen yang dimasukkan terserah dan akan menjadi imutable)



    List<Object> elemen = List.of("fajar","nissa","ujeh");
    for (var print: elemen ){
      System.out.println(print);
    }


     */


  }

  /*
  public static class Person<T>{
    private String name;
    private List<String> list;

    public Person(String name) {
      this.name = name;
      this.list = new ArrayList<>(list);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<String> getList() {
      return list;
    }

    public void setList(List<String> list) {
      this.list = list;
    }
  }


   */

  public static void doSomeThinkWithHobbies(List<String> hobbies){
    /*
    ketika sudah diset menjadi imutable maka program akan error karna ada yang memaksa mengubah List
     */
    hobbies.add("ini bukan hobi");//ini bahaya karna data disini akan masuk kedalam listHobbies padahal kita tidak memasukan add() didalam imutable di atas
  }
}
