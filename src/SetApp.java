import java.util.*;

public class SetApp {
  public static void main(String[] args) {
    Set<Object> nama = new LinkedHashSet<>();
    Set<Object> names = new HashSet<>();

    System.out.println("di bawah ini menggunakan HashSet");
    names.add("jupri");
    names.add("fajar");
    names.add("ujeh");
    for (var u : names){
      System.out.println(u);
    }

    System.out.println("=============");
    System.out.println("di bawah ini menggunakan LinkedHashSet");
    nama.add("jupri");
    nama.add("fajar");
    nama.add("ujeh");
    for(var print : nama){
      System.out.println(print);
    }

    /*
    ini mengakses enum menggunakan EnumSet

    EnumSet<Gender> kelamin = EnumSet.allOf(Gender.class);
    for (var gender : kelamin){
      System.out.println(gender);
    }

     */

    //di bawah ini adalah mengakses enum dengan cara lain(ini lebih recomended)

    Gender[] value = Gender.values();
    for (var values : value){
      System.out.println(values);
    }


  }


  // method enum
  public static enum Gender{
    MALE,FAMELE,NOTMENTION;
  }
}
