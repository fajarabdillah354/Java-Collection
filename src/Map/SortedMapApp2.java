package Map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp2 {
  /*
  di bawah ini contoh SortedMap menggunakan Comparator yang ada dalam inner class
   */

  public static void main(String[] args) {
    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    };

    //kita harus menggunakan variabel yang diCompare agaar bisa menggunakan Comparatornya
    SortedMap<String,String> domisili = new TreeMap<>(comparator.reversed());


    domisili.put("fajar","jakarta");
    domisili.put("bagas","jakarta");
    domisili.put("adinu","sragen");

    for (var value : domisili.keySet()){
      System.out.println(value);
    }

  }

}
