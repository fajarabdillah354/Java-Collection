package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedApp {

  public static void main(String[] args) {
    List<String> date = new ArrayList<>();
    date.addAll(List.of("senin","selasa","rabu","kamis"));

    Collections.sort(date);//untuk mengurutkan data SESUAI ALFABETNYA
    for (var urut : date){
      System.out.println(urut);
    }

    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    System.out.println("======== DESENDING =========");
    Collections.sort(date,comparator);
    for (var desending : date){
      System.out.println(desending);
    }
  }
}
