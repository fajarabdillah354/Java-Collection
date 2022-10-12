import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DefaultMethodCollection {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1;i<=10;i++){
      list.add(i);
    }

    System.out.println(list);

    list.replaceAll(new UnaryOperator<Integer>() {
      @Override
      public Integer apply(Integer integer) {
        return integer * 2;//kita mengkali semua element list dengan 2
      }
    });

    System.out.println(list);//hasil dari list telah di kali 2


    list.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }//akan mencetak atau melakukan perulangan kebawah
    });



  }
}
