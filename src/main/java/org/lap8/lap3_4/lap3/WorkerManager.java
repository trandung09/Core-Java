package org.lap8.lap3_4.lap3;

import lombok.Getter;
import lombok.Setter;
import org.lap8.lap3_4.lap3.models.Worker;
import org.lap8.lap3_4.lap3.supports.Pair;

import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
public class WorkerManager {

    private final List<Worker> workers = new ArrayList<>();

    private final Map<Integer, Pair<String, LocalDate>> salaryStatus = new HashMap<>();

    private WorkerManager() {
        workers.add(new Worker("worker1", 25, 25000000, "..."));
        workers.add(new Worker("worker2", 26, 18000000, "..."));
        workers.add(new Worker("worker3", 35, 46000000, "..."));
        workers.add(new Worker("worker4", 45, 60000000, "..."));

        for (Worker worker : workers) {
            salaryStatus.put(worker.getId(), new Pair<>("NORMAL", null));
        }
    }

    public void addWorker(Worker worker) {
        if (worker == null) return;
        workers.add(worker);

        salaryStatus.put(worker.getId(), new Pair<>("NORMAL", null));
    }

    public Worker findWorkerByID(int workerID) {
        return workers.stream()
                .filter(o -> o.getId() == workerID)
                .findFirst()
                .orElse(null);
    }

    public void removeWorker(int workerID) {
        workers.removeIf(o -> o.getId() == workerID);
    }

    public void displayInfomationSalary() {

        System.out.println("Display infomation salary");
        System.out.printf("%-8s %-15s %-10s %-15s %-15s %-20s\n","Code", "Name", "Age", "Salary", "Status", "Date");
        for (Worker worker : workers) {
            Pair<String, LocalDate> workerSalaryStatus = salaryStatus.get(worker.getId());
            String date = workerSalaryStatus.date == null ? "Null" : workerSalaryStatus.date.toString();
            System.out.printf("%-8d %-15s %-10d %-15.1f %-15s %-20s\n",
                    worker.getId(), worker.getName(), worker.getAge(), worker.getSalary(),
                    workerSalaryStatus.status, date);
        }
    }

    public static WorkerManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final WorkerManager INSTANCE = new WorkerManager();
    }
}
