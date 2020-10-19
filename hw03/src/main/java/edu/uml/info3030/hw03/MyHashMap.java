package edu.uml.info3030.hw03;

import java.util.HashMap;

/**
 * This class is my implementation of a generic hash map
 */
public class MyHashMap<K, V>
{
    // Class storage using non-generic hash map
    private HashMap map;

    /**
     * Public constructor invoked when creating an instance of the class
     */
      public MyHashMap () {
          map = new HashMap();
      }

    /**
     * Puts key and associated value into the hash map
     * @param key of type K
     * @param value of type V
     */
    public void put(K key, V value)
    {
      map.put(key, value);
    }

    /**
     * Given a key, gets the associated value
     * @param key of type K
     * @return value of type V
     */
    public V get(K key)
    {
        return (V)map.get(key);
    }

    /**
     * Given a key, removes the associated value from the hash map
     * @param key
     */
    public void remove(K key)
    {
        map.remove(key);
    }
}