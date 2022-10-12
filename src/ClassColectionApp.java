import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassColectionApp {

  public static void main(String[] args) {
    List<String> data1 = new ArrayList<>();
    data1.addAll(List.of("fajar","ujeh","fahmi"));
    List<String> data2 = new ArrayList<>();
    data2.addAll(List.of("senin","selasa","rabu","kamis"));

    Collections.reverse(data1);
    System.out.println(data1);

    int get = Collections.frequency(data1,"fajar");
    System.out.println(get);

    var up = Collections.max(data2);
    System.out.println(up);

    Collections.shuffle(data2);//akan mengacak atau merandom
    System.out.println(data2);


  }
}
