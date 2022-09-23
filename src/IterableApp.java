import jdk.swing.interop.SwingInterOpUtils;

import java.util.Iterator;
import java.util.List;

public class IterableApp<T> {
  public static void main(String[] args) {
    /*
    untuk melakukan Iterable kita harus akses ke interface Iterable
     */
    Iterable<String> names = List.of("FAJAR","ARSI","SANDI");
    System.out.println("isi list Name : "+names);
    for(var name : names){
      System.out.println(name.toLowerCase());
    }

    System.out.println("Di Bawah Ini adalah dengan cara menggunakan Iterator,karena interface Iterator mempunyai Nama var iterator");
/*
ketika kita menggunakan iterator kita juga harus memakai Method iterator()
 */
    Iterator<String> iterator = names.iterator();

    while(iterator.hasNext()){
      String name = iterator.next();
      System.out.println(name);
    }
  }
}
