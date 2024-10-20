package org.lap8.lap3_4.lap3;

import org.lap8.lap3_4.lap3.models.Worker;
import org.lap8.lap3_4.lap3.services.WorkerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkerApplication {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final WorkerManager workerManager = WorkerManager.getInstance();
    private final WorkerService workerService = WorkerService.getInstance();

    public void menu() {
        System.out.println("\n1. Add worker.");
        System.out.println("2. Up salary.");
        System.out.println("3. Down salary.");
        System.out.println("4. Display infomation salary.");
        System.out.println("0. Exit.");
    }

    public void application() throws IOException {

        String answer;
        do {
            menu();
            System.out.print("Enter command: ");
            answer = br.readLine();
            System.out.println();

            Worker worker;
            switch (answer) {
                case "1" -> {
                    worker = workerService.getWorker(br);
                    workerManager.addWorker(worker);
                }
                case "2" -> {
                    System.out.print("Enter worker id: ");
                    int id = Integer.parseInt(br.readLine());
                    System.out.print("Enter increment salary: ");
                    double newSalary = Double.parseDouble(br.readLine());
                    workerService.increaseSalary(workerManager.findWorkerByID(id), newSalary);
                }
                case "3" -> {
                    System.out.print("Enter worker id: ");
                    int id = Integer.parseInt(br.readLine());
                    System.out.print("Enter decrease salary: ");
                    double newSalary = Double.parseDouble(br.readLine());
                    workerService.decreaseSalary(workerManager.findWorkerByID(id), newSalary);
                }
                case "4" -> {
                    workerManager.displayInfomationSalary();
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("Invalid command");
            }
        } while (true);
    }

    public static void main(String[] args) throws IOException {

        new WorkerApplication().application();

    }
}
