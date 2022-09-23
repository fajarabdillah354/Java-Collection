import java.util.*;

public class ListApp {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>(); //LIST
    List<Integer> link = new LinkedList<>();
    link.addAll(Arrays.asList(6,4,7,1,9,3));
    System.out.println(link.contains(4));
    link.removeAll(Arrays.asList(6,9,3));

    /*
    menuliskan beberapa element secara langsung
     */
    integerList.addAll(Arrays.asList(3,5,1,7,4,13,25,43));
    System.out.println(integerList);
    Integer ambil = integerList.get(4);
    System.out.println(ambil);
    /*
    mengambil hashcode
     */
    System.out.println(integerList.hashCode());

    /*
    mengambil data
     */
    System.out.println(integerList.get(2));

    /*
    mengecek apakah data tersedia
     */

    System.out.println(integerList.contains(13));

    /*
    mensorting data dengan menggunakan Class Collection
    * kita harus implements dulu ke Comparator
     */
    Collections.sort(integerList,new SortListApp());
    for (var number : integerList){
      System.out.print(number);//ini berurut dari kanan ke kiri
    }


  }

}
