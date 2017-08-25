package cn.ms.neural.extension.singleton;

import java.util.concurrent.atomic.AtomicLong;

import cn.ms.neural.extension.Activation;

@Activation("spiSingletonImpl")
public class NspiSingletonImpl implements NspiSingleton {
    private static AtomicLong counter = new AtomicLong(0);
    private long index = 0;

    public NspiSingletonImpl() {
        index = counter.incrementAndGet();
    }

    @Override
    public long spiHello() {
        return index;
    }

}