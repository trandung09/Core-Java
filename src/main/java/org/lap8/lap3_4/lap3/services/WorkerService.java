package org.lap8.lap3_4.lap3.services;

import org.lap8.lap3_4.lap3.WorkerManager;
import org.lap8.lap3_4.lap3.models.Worker;
import org.lap8.lap3_4.lap3.supports.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class WorkerService {

    private WorkerService() {
    }

    public Worker getWorker(BufferedReader br) throws IOException {

        System.out.print("Enter worker name: ");
        String name = br.readLine();
        System.out.print("Enter worker age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter worker salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Enter worker place: ");
        String workerPlace = br.readLine();

        return new Worker(name, age, salary, workerPlace);
    }

    public void increaseSalary(Worker worker, double value) {
        if (worker == null) return;
        if (value < 0) return;

        worker.setSalary(worker.getSalary() + value);
        setSalaryStatus(worker, "UP");
        System.out.println("Successful salary increase");
    }

    public void decreaseSalary(Worker worker, double value) {
        if (worker == null) return;
        if (value < 0) return;
        if (worker.getSalary() < value) throw new IllegalArgumentException("Cannot reduce worker salaries to negative ");

        worker.setSalary(worker.getSalary() - value);
        setSalaryStatus(worker, "DOWN");

        System.out.println("Successful salary decrease");
    }

    private void setSalaryStatus(Worker worker, String status) {
        WorkerManager workerManager = WorkerManager.getInstance();

        Pair<String, LocalDate> workerSalaryStatus = workerManager.getSalaryStatus()
                .get(worker.getId());

        workerSalaryStatus.status = status;
        workerSalaryStatus.date = LocalDate.now();
    }

    public static WorkerService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final WorkerService INSTANCE = new WorkerService();
    }
}
