import java.util.HashMap;

class HashMap_<K,V> implements Map<K,V>
{
    HashMap<K, V> m = new HashMap<K, V>();

    public void put(K Key,V Value)
    {
        m.put(Key, Value);
    }

    public String get(K Key)
    {
        if(m.containsKey(Key)) { 
        	return m.get(Key).toString();
        }
        else {
        	return  "*"+Key.toString()+"* ";
        }
    }
}