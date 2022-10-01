import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

  /*

   */
  public static void main(String[] args) {
    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("fajar","abdillah","ahmad","kece","badai"));
    NavigableSet<String> reverse = names.descendingSet();
    NavigableSet<String> tail = names.tailSet("badai",true);//inclusive untuk memberi tahu badai akan termasuk dalam perhitungan hingga elemen ekor(paling akhier)

    NavigableSet<String> head = names.headSet("fajar",true);


    NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(names);
    // imutable.add("sedunia");//ini akan error karna data sudah di set imutable jadi tidak boleh asal menambah data sembarangan diluar var names
    for (var print : tail){
      System.out.println(print);
    }

  }
}
