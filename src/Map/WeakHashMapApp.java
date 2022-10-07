package Map;


import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
  /*
  pada WeakHashMap akan membuang data MAP yang jarang dipakai,sehingga sangat cocok sekali dijadikan tempat penyimpanan sementara
   */
  public static void main(String[] args) {
    Map<Integer,Integer> num = new WeakHashMap<>();
    for (var x = 0;x<1000000;x++){
      num.put(x,x);

    }

    System.gc();//akan membuang map yang jarang atau tidak dipakai dari memory

    System.out.println(num.size());//seharusnya ketika mencetak map akan berulang hingga sejuta

  }

}
