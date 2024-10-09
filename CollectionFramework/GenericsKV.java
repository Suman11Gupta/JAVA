package CollectionFramework;

public class GenericsKV<Key,Value> {
  Key k;
  Value v;

    public GenericsKV(Key k, Value v) {
        this.k = k;
        this.v = v;
    }

    public Key getK() {
        return k;
    }

    public void setK(Key k) {
        this.k = k;
    }

    public Value getV() {
        return v;
    }

    public void setV(Value v) {
        this.v = v;
    }

    public Value getKTest() {
        return v;
    }

    @Override
    public String toString() {
        return "GenericsKV{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
