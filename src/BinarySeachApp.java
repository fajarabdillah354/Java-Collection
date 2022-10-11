import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySeachApp {

  public static void main(String[] args) {
    List<String> day = new ArrayList<>();
    day.addAll(List.of("senin","selasa","rabu","kamis","jumat","sabtu","minggu"));

    /*
    saat menggunakan BinarySort kita harus mengsorting dulu data listnya
     */
    Collections.sort(day);
    int index = Collections.binarySearch(day,"kamis");
    System.out.println(index);

    /*
    dibawah ini jika menggunakan Comparator,kebetulan ini membuat Comparator baru dengan inner class
     */
    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }

    };

    int index2 = Collections.binarySearch(day,"kamis");
    System.out.println(index2);

  }
}
