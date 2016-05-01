package be.tomcools.gettersetterverifier.internals.valuefactories.collections;

import be.tomcools.gettersetterverifier.internals.Producer;

import java.util.LinkedList;

/**
 * Represents a ListValueFactory
 * Created by nicojs on 8/15/2015.
 */
public class LinkedListValueFactory extends CollectionValueFactory<LinkedList> {

    public LinkedListValueFactory() {
        super(LinkedList.class, new Producer<LinkedList>() {
            @Override
            public LinkedList produce() {
                return new LinkedList();
            }
        });
    }
}
