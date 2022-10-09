package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {

  public static void main(String[] args) {
    /*
    Entry adalah method sederhana yang berisikan Method untuk mengambil KEY dan VALUE
     */
    Map<String,String> entries = new LinkedHashMap<>();
    entries.put("Fajar","jakarta");
    entries.put("wahyu","bekasi");
    entries.put("gilang","tangerang");
    entries.put("slebew","bandung");


    int index = entries.size();//untuk mengetahui ukuran Map(data yang sudah ter isi)
    System.out.println("isi data : "+index);

    boolean cek = entries.containsValue("bekasi");//untuk pengecekan data
    System.out.println(cek);

    Set<Map.Entry<String,String>> entri = entries.entrySet();//untuk menampilkan isi semua KEY dan VALUE
    for (var choice : entri){
      System.out.println(choice);
    }


  }
}
