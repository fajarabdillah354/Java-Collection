import com.sun.security.jgss.GSSUtil;

import java.util.Queue;

public class AbsractCollectionApp {
  public static void main(String[] args) {
    Queue<String> queue = new AbstractCollection<>();//menggunakan method yang berisi abstract Collecion untuk Queue
    System.out.println(queue.offer("fajar"));//yang diterima hanya data ini saja karna menggunakan singleton
    System.out.println(queue.offer("nisa"));
    System.out.println(queue.offer("ujeh"));
    System.out.println("====================");

    System.out.println(queue.size());//cek ukuran
    //System.out.println(queue.peek());//mengambil data
    System.out.println(queue.poll());
    //System.out.println(queue.poll());//mengambil dan menghapus
    System.out.println(queue.size());

  }
}
