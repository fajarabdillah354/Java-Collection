package Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ImutableMapApp {

  public static void main(String[] args) {
    /*
    * empty membuat imutable map kosong
    * singleton membuat imutable map 1 data saja
    * unmodifiableMap merubah mutableMap ke imutableMap
    * map.off membuat data imutableMap baru yang berisi KEY dan VALUE
     */
    Map<String,String> empty = Collections.emptyMap();
    Map<String,String> singleton = Collections.singletonMap("fajar abdillah ahmad" ,"laki-laki");
    Map<String,Integer> dataDiri = new LinkedHashMap<>();
    dataDiri.put("Fajar Abdillah Ahmad",21);
    dataDiri.put("Sandy Maldini",20);
    dataDiri.put("Ryan Adi",21);
    Map<String,Integer> imutabledataDiri = Collections.unmodifiableMap(dataDiri);

    imutabledataDiri.put("Ramahyana",100);//akan error karna sudah di set imutable

    Map<String,String> newMap = Map.of(
      "first","fajar",
      "midle","abdillah",
      "last","ahmad"
    );
  }


}
