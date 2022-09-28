import java.util.List;

public class AksesImutableApp {

  public static void main(String[] args) {
    ImutableApp imutableApp = new ImutableApp("fajar");
    imutableApp.addHobby("fishing");
    imutableApp.addHobby("swimming Pool");
    imutableApp.addHobby("playing football");
    System.out.println("my name is : "+imutableApp.getName());
    System.out.println("my hobbies is : ");
    // doSomeThinkWithHobbies(imutableApp.getHobbies());//ilegal memasukan ke dalam list
    for (var hobi : imutableApp.getHobbies()){
      System.out.println(hobi);
    }

  }

  public static void doSomeThinkWithHobbies(List<String> hobbies){
    /*
    ketika sudah diset menjadi imutable maka program akan error karna ada yang memaksa mengubah List
     */
    hobbies.add("ini bukan hobi");//ini bahaya karna data disini akan masuk kedalam listHobbies padahal kita tidak memasukan add() didalam imutable di atas
  }
}
