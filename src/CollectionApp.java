import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    /*
    memakai method add()
     */
    collection.add("makan");
    collection.add("mandi");
    collection.add("kerja");
    for (var name : collection){
      System.out.println(name);
    }

    /*
    memakai method addAll()
     */
    System.out.println("ini jika memakai method addAll()");
    collection.addAll(Arrays.asList("berenang","main Bola", "berkuda"));
    for (var values : collection){
      System.out.println(values);
    }
    /*
    mengecek isi list
     */
    var check = collection.contains("makan");
    System.out.println(check);

    /*
    menghapus elemen di list
     */

    var hapusList = collection.remove("main Bola");
    System.out.println(hapusList);

    for (var name : collection){
      System.out.println(name);
    }
    /*
    menghapus data list
     */
    collection.clear();
    System.out.println(collection);

  }
}
