package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

  public static void main(String[] args) {
    Map<String,Integer> gaji = new LinkedHashMap<>();
    gaji.put("Fajar Abdillah Ahmad",50_000_000);
    gaji.put("henry prayogo",5_000_000);
    gaji.put("ipul",4_000_000);
    gaji.put("otong pararotong",9_000_000);
    gaji.put("ujeh",30_000_000);

    /*
    * bisa juga menggunakan Set<> untuk menaruh keySet() nya
    Set<String> keys = gaji.keySet();
     */
    for (var get : gaji.keySet()){
      System.out.println(get);
    }
  }




}
