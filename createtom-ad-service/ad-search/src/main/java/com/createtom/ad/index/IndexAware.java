package com.createtom.ad.index;

/**
 * Date: 2019/2/28 15:15
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
