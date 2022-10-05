import java.util.ArrayDeque;
import java.util.Deque;

public class StackApp {

  public static void main(String[] args) {
    /*
    saat menggunakan deque kita bisa melakukan first in first out ataupun last in first out
    dalam artian bisa mengambil data dari belakang maupun depan
     */
    Deque<String> stack = new ArrayDeque<>();

    stack.offerLast("fajar");
    stack.offerLast("nisa");
    stack.offerLast("ujeh");

    System.out.println("=========ini data yang tersedia ===========");
    for(var value : stack){
      //mencetak data yang ada
      System.out.println(value);
    }

    System.out.println("========= mengambil data dari belakang(stack) dari data =========");
    //poll digunakan untuk mengambil data,dibawah ini kita mengambil data pertama dari data terakhir
    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());


    System.out.println("========== mengambil data dari depan(antrian) ===========");
    System.out.println(stack.pollFirst());
    System.out.println(stack.pollFirst());
    System.out.println(stack.pollFirst());

  }


}
