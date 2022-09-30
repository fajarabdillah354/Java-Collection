import java.util.ArrayList;
import java.util.List;

public class Person {

  public Person(String name) {
    this.name = name;
    this.barang = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            '}';
  }

  private String name;

  private List<Object> barang;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Object> getBarang() {
    return barang;
  }

  public void setBarang(List<Object> barang) {
    this.barang = barang;
  }
}
