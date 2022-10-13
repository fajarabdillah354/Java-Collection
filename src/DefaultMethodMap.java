import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class DefaultMethodMap {

  public static void main(String[] args) {

    Map<String, Integer> bio = new LinkedHashMap<>();

    bio.put("fajar",20);
    bio.put("abdul",19);
    bio.put("randi",23);
    bio.put("nisa",18);

    for (var get : bio.keySet()){
      System.out.println(get);
    }

    bio.replaceAll(new BiFunction<String, Integer, Integer>() {//untuk mereplace data key
      @Override
      public Integer apply(String s, Integer integer) {

       return integer;
      }
    });
    System.out.println(bio);

    bio.forEach(new BiConsumer<String, Integer>() {//untuk iterasi seluruh data key
      @Override
      public void accept(String s, Integer integer) {
        System.out.println(s + " : " + integer);
      }
    });


  }

}
