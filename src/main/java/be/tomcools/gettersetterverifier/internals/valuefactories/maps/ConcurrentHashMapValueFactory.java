package be.tomcools.gettersetterverifier.internals.valuefactories.maps;

import be.tomcools.gettersetterverifier.internals.Producer;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Represents a ConcurrentHashMapValueFactory
 * Created by nicojs on 8/16/2015.
 */
public class ConcurrentHashMapValueFactory extends MapValueFactory<ConcurrentHashMap> {
    public ConcurrentHashMapValueFactory() {
        super(ConcurrentHashMap.class, new Producer<ConcurrentHashMap>() {
            @Override
            public ConcurrentHashMap produce() {
                return new ConcurrentHashMap();
            }
        });
    }
}
