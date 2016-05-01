package be.tomcools.gettersetterverifier.internals.valuefactories.queues;

import be.tomcools.gettersetterverifier.internals.ValueFactory;

import java.util.concurrent.SynchronousQueue;

/**
 * Represents a SynchronousQueueValueFactory
 * Created by nicojs on 8/19/2015.
 */
public class SynchronousQueueValueFactory extends ValueFactory<SynchronousQueue> {
    public SynchronousQueueValueFactory() {
        super(SynchronousQueue.class);
    }

    @Override
    public SynchronousQueue next() {
        return new SynchronousQueue(); // Always unique
    }
}
