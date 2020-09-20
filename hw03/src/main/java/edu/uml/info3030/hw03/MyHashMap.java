package edu.uml.info3030.hw03;

import java.util.HashMap;

public class MyHashMap<K, V> {
  private HashMap map;

  public MyHashMap () {
   map = new HashMap();
  }

  public void put(K key, V value) {
    map.put(key, value);
  }

  public V get(K key) {
   return (V)map.get(key);
  }

  public void remove(K key) {
   map.remove(key);
  }
}