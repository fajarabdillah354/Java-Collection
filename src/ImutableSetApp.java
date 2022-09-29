import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImutableSetApp {

  private String listSet;

  public String getListSet() {
    return listSet;
  }

  public void setListSet(String listSet) {
    this.listSet = listSet;
  }

  public static void main(String[] args) {

    // ini akak error karna berusaha memasukan ke dalam Set yang sudah di imutable kan
//    Set<Object> toImutable = Collections.unmodifiableSet(mutable());
//    toImutable.add("alpro");


    // membuat Set kosong  yang siap di isi data(ini sudah bersifat imutable)
    Set<Object> listKosong;
    listKosong = mutable();
    listKosong.add(addList());
    // listKosong.remove(mutable());  menghapus ListSet
    System.out.println(listKosong);

    /*
      membuat 1 imutable Set
    Set<Object> one = Collections.singleton("mtk");
    one.add(listKosong);
     */


  }

  public static Set<Object> mutable(){
    Set<Object> mutable = new HashSet<>();
    mutable.add("logika informatika");
    mutable.add("kalkulus");
    mutable.add("Struktur data");
    mutable.add("OAK");

    for (var cek : mutable){
      System.out.println(cek);
    }
    return mutable;
  }

  public static Set<Object> addList(){
    Set<Object> nambahList = new HashSet<>();
    nambahList.add("alpro");
    nambahList.add("b.ing");
    for (var tambah : nambahList ){
      System.out.println(tambah);
    }

   return nambahList;
  }


}
