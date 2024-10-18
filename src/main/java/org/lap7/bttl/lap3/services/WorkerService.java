package org.lap7.bttl.lap3.services;

import org.lap7.bttl.lap3.models.Worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class WorkerService {

    private WorkerService() {}

    public Worker getWorker(BufferedReader br) throws IOException {
        System.out.println("Nhap ten cong nhan: ");
        String name = br.readLine();
        System.out.println("Nhap tuoi cong nha: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Nhap noi lam viec: ");
        String workplace = br.readLine();
        System.out.println("Nhap luong cong nhan: ");
        double salary = Double.parseDouble(br.readLine());

        return new Worker(name, age, workplace, salary);
    }

    public void upDownSalary(ArrayList<Worker> workers, String key, double newSalary) throws IOException {
        if (workers.isEmpty()) {
            System.out.println("Khong co cong nhan nao.");
            return;
        }
        if (key.equalsIgnoreCase("up")) {
            for (int i = 0; i < workers.size(); i++) {
                double oldSalary = workers.get(i).getSalary();
                workers.get(i).setSalary(oldSalary + newSalary);
            }
            return;
        }
        for (int i = 0; i < workers.size(); i++) {
            double oldSalary = workers.get(i).getSalary();
            workers.get(i).setSalary(oldSalary - newSalary);
        }
    }

    public void printAllWorkerInfo(ArrayList<Worker> workers) {
        if (workers.isEmpty()) {
            System.out.println("Khong co cong nhan nao.");
            return;
        }
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

    public static WorkerService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final WorkerService INSTANCE = new WorkerService();
    }
}
