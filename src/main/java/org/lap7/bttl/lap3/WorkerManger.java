package org.lap7.bttl.lap3;

import lombok.Getter;
import org.lap7.bttl.lap3.models.Worker;

import java.util.ArrayList;

@Getter
public class WorkerManger {

    private final ArrayList<Worker> workers = new ArrayList<Worker>();

    public WorkerManger() {
        workers.add(new Worker("A", 25, "XX", 15000000));
        workers.add(new Worker("B", 22, "XY", 15000000));
        workers.add(new Worker("C", 38, "YY", 25000000));
        workers.add(new Worker("D", 50, "YX", 45000000));
    }

    public void AddWorker(Worker worker) {
        if (worker == null) return;
        if (workers.contains(worker)) {
            return;
        }
        workers.add(worker);
    }

    public void RemoveWorker(int id) {
        Worker worker = workers.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
        RemoveWorker(worker);
    }

    public void RemoveWorker(Worker worker) {
        if (worker == null) return;
        workers.remove(worker);
    }
}
