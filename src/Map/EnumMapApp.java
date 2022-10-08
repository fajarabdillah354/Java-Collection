package Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {

  public static enum Category{

    Standart,Premium,VIP
  }

  public static void main(String[] args) {
    Map<Category,String> konser = new EnumMap<>(Category.class);
    /*
    EnumMap harus berisi data yang unique(tidak boleh sama)
     */
    konser.put(Category.VIP,"Fajar Abdillah Ahmad");
    konser.put(Category.Standart,"Sandy Maldini");
    konser.put(Category.Premium,"Reyhan Firdaus");

    System.out.println("******* Isi Category ********");
    for (var print : konser.keySet()){
      System.out.println(print);
    }


    System.out.println(konser.get(Category.VIP));
    System.out.println(konser.get(Category.Premium));
    System.out.println(konser.get(Category.Standart));

    //mengecek size Map(ada berapa data)
    System.out.println(konser.size());



  }
}
