package Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityMapApp {
  public static void main(String[] args) {
    Map<String,String> map = new IdentityHashMap<>();

    /*
     * saat menggunakan IdentityHashMap pengecekan menggunakan operator reference equality(==) bukan equals sehingga data yang sama akan dihitung 2 data yang berbeda ini dikarenakan tempat penyimpanan yang berbeda
     */


    String name1 = "fajar";
    String name2 = "abdillah";
    String name3 = "ahmad";

    String fullName = name1+" "+name2+" "+name3;
    String name = "fajar abdillah ahmad";
    System.out.println(fullName);
    System.out.println(name);
    System.out.println(fullName.equals(name));//ini akan bernilai True karna isi datanya sama walaupun terletak pada memory yang beda
    System.out.println(fullName == name);//ini akan bernilai false karna terletak pada memory  yang berbeda

    /*
    ketika menggunakan IdentityHashMap maka ini akan dianggap menjadi 2 data yang berbeda walaupun substansinya sama
     */
    map.put(fullName,"laki-laki");
    map.put(name,"laki-laki");
    System.out.println(map.size());


  }

}
