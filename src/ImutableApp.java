import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
  private String name;
  private List<String> hobbies;

  public ImutableApp(String name) {
    this.name = name;
    this.hobbies = new ArrayList<>();
  }

  public void addHobby(String hoby){
    hobbies.add(hoby);
  }

  /*
  ini sebelum data getHobbies di set imutable

  public List<String> getHobbies(){
    return hobbies;//ini bahaya karna list tidak bersifat imutable
  }
  */



  /*
  merubah data mutable menjadi imutable
   */
  public List<String> getHobbies(){
    return Collections.unmodifiableList(hobbies);//ini aman karna sudah diset menjadi imutable
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
