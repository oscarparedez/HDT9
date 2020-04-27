import java.util.*;

public class Association<K,V> implements Map<K,V>
{
    HashMap<K, V> m = new HashMap<K, V>();

    public void put(K k,V v)
    {
        m.put(k, v);
    }

    public String get(K k){
        if(m.containsKey(k)) { 
        	return "* "+m.get(k).toString().toUpperCase()+" * ";
        }
        else {
        	return  "* "+k.toString()+" * ";
        }
    }

}