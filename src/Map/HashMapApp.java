package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

  public static void main(String[] args) {

    /*
    * HashMap mendistribusikan KEY menggunakan    hashcode function
    * KEY yang ada tidak boleh diplicate.ini karna pengecekannya menggunakan Equals()
    * urutan Map yang menggunakan HashMap akan random(tidak sesuai dengan penulisan)
     */
    Map<String,Integer> uas = new HashMap<>();
    System.out.println("===== nama-nama peserta ujian CPNS ======");
    //       KEY,VALUE
    uas.put("Cemen Simanjutak",96);
    uas.put("Sujdono",92);
    uas.put("Kakek Sugiono",80);
    uas.put("Ucup Jumiancup",90);

    for (var value : uas.keySet()){
      System.out.println(value);
    }

    System.out.println("==== nilai tertinggi ujian CPNS ====");
    for(var nilai : uas.values()){
      System.out.println(nilai);
    }
    System.out.println("==========================");
    var nilaiCemen = uas.get("Cemen Simanjutak");
    System.out.println("nilai Cemen : "+nilaiCemen);//jika value tidak sesuai dengan yang ada maka akan mengembalikan nilai null

  }

}
