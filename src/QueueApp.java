import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

  /*
  Queue adalah sebuah struktur data mirip dengan antrian,yang pertama masuk dia yang keluar

   */
  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<>(10);//jika data sudah di atas dari 10 maka secara otomatis akan meresize

    Queue<String> prioritas = new PriorityQueue<>();//jika menggunakan konkrit implementasi PriorityQueue maka data akan secara otomatis diurutkan
    prioritas.offer("nisa");
    prioritas.offer("bila");
    prioritas.offer("azzahra");

    queue.add("sandi");
    queue.add("ryan");
    queue.add("fajar");

     /*
    for (var i = 0;i<20;i++){
      queue.add(String.valueOf(i));
    }
     */

    for (String get = prioritas.poll();get!=null; get = prioritas.poll() ){
      System.out.println(get);
    }

    for (String next = queue.poll();next!=null;next = queue.poll()){
      System.out.println(next);

    }
    System.out.println(queue.offer("fajar"));

  }



}


