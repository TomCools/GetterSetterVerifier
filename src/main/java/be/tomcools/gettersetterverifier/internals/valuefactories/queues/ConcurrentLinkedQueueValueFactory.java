package be.tomcools.gettersetterverifier.internals.valuefactories.queues;

import be.tomcools.gettersetterverifier.internals.Producer;
import be.tomcools.gettersetterverifier.internals.valuefactories.collections.CollectionValueFactory;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Represents a ConcurrentLinkedQueueValueFactory
 * Created by nicojs on 8/19/2015.
 */
public class ConcurrentLinkedQueueValueFactory extends CollectionValueFactory<ConcurrentLinkedQueue> {
    public ConcurrentLinkedQueueValueFactory() {
        super(ConcurrentLinkedQueue.class, new Producer<ConcurrentLinkedQueue>() {
            @Override
            public ConcurrentLinkedQueue produce() {
                return new ConcurrentLinkedQueue();
            }
        });
    }
}
