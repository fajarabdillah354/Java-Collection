import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class AbstractCollection<T> extends AbstractQueue<T> {
  private T data ;
  @Override
  public Iterator<T> iterator() {
    return Collections.singleton(data).iterator();
  }

  @Override
  public int size() {
    return data == null ? 0:1;
  }

  @Override
  public boolean offer(T t) {
    if (data == null){
      data = t;
      return true;
    }
    return false;
  }

  @Override
  public T poll() {
    T temp = data;
    data = temp;
    return temp;
  }

  @Override
  public T peek() {
    return data;
  }
}


