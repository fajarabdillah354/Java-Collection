package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
  /*
  konkrit implementasi dari sorted Map adalah class TreeMap,di bawah ini tanpa menggunakan Comparator
   */

  public static void main(String[] args) {
    SortedMap<String,Integer> dateSiswa = new TreeMap<>();

    dateSiswa.put("Fajar Abdillah Ahmad",21);
    dateSiswa.put("Siti Anisah",20);
    dateSiswa.put("Anak Singkong",19);
    dateSiswa.put("Radjimana Rajin",15);
    //Ketika di cetak maka akan berurut sesuat urutan alfabet (yang diurutkan terlebih dahulu adalah KEYnya baru VALUEnya
    for (var value : dateSiswa.keySet()){
      System.out.println(value);
    }

    System.out.println(dateSiswa.values());
    System.out.println(dateSiswa.get("Anak Singkong"));
  }
}
