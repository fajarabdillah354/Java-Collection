import java.util.SortedSet;
import java.util.TreeSet;

public class SortedListApp {
  public static void main(String[] args) {
    SortedSet<Person> objects = new TreeSet<>(new PersonComparator());
    objects.add(new Person("fajar"));
    objects.add(new Person("nisa"));
    objects.add(new Person("bagas"));
    objects.add(new Person("juma"));


    //akan mengurutkan list name berdasarkan alfabet
    for (var get : objects){
      System.out.println(get);
    }

  }

}
