import java.util.Set;

public interface Map<K,V> {
    public String get(K Key);
    public void put(K Key, V Value);
    public Set<K> keySet();
}