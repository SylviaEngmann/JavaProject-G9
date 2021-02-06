import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    Map<T, T> bag = new HashMap<>();

    public void addToBag(T e) {
        this.bag.put(e, e);
    }

    public void removeInOneBag(T e) {
        this.bag.remove(e);
    }

    public void removeAllInBag() {
        bag.clear();
    }

}
