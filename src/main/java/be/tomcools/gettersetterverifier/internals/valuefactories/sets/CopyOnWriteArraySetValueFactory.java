package be.tomcools.gettersetterverifier.internals.valuefactories.sets;

import be.tomcools.gettersetterverifier.internals.Producer;
import be.tomcools.gettersetterverifier.internals.valuefactories.collections.CollectionValueFactory;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Represents a CopyOnWriteArraySetValueFactory
 * Created by nicojs on 8/17/2015.
 */
public class CopyOnWriteArraySetValueFactory extends CollectionValueFactory<CopyOnWriteArraySet> {
    public CopyOnWriteArraySetValueFactory() {
        super(CopyOnWriteArraySet.class, new Producer<CopyOnWriteArraySet>() {
            @Override
            public CopyOnWriteArraySet produce() {
                return new CopyOnWriteArraySet();
            }
        });
    }
}
