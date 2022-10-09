package Map;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
  public static void main(String[] args) {
    NavigableMap<String, Integer> map = new TreeMap<>();
    map.put("Fajar abdillah ahmad", 21);
    map.put("Andik firmansyah", 25);
    map.put("I putu wayan", 21);
    for (var get : map.keySet()) {
      System.out.println(get);
    }
    System.out.println("============== ini menggunakan function NavigabelMap ================");
    System.out.println(map.lowerKey("Fajar abdillah ahmad"));//kurang dari KEY
    System.out.println(map.higherKey("Fajar abdillah ahmad"));//lebih dari KEY

    System.out.println(map.ceilingKey("Fajar abdillah ahmad"));//kurang dari samadengan(jadi KEY yang ada di parameter akan included juga)

    System.out.println("===== Desending NavigableMap ======");
    NavigableMap<String,Integer> descending = map.descendingMap();
    for (var balik : descending.keySet()){
      System.out.println(balik);
    }

    /*
    membuat Imutable NavigableMap
     */

    NavigableMap<String,Integer> empty = Collections.emptyNavigableMap();//membuat imutable kosong
    NavigableMap<String,Integer> imutable = Collections.unmodifiableNavigableMap(map);//merubah dari mutable ke imutable
    //imutable.put("Siti Anisah",20);//akan error karna sudah diset imutable


  }

}
