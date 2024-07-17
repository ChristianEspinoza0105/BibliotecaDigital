package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Monitor {
    private final ReentrantLock lock = new ReentrantLock();

    public void sincronizarAcceso(Runnable tarea) {
        lock.lock();
        try {
            tarea.run();
        } finally {
            lock.unlock();
        }
    }
}
