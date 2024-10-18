package org.lap7.bttl.lap3;

import org.lap7.bttl.lap3.models.Worker;
import org.lap7.bttl.lap3.services.WorkerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkerApplication {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    WorkerService workerService = WorkerService.getInstance();
    WorkerManger  workerManger = new WorkerManger();

    void menu() {
        System.out.println("1. Them cong nhan.");
        System.out.println("2. Tang luong cong nhan.");
        System.out.println("3. Giam luong cong nhan.");
        System.out.println("4. Hien thi thong tin cong nhan.");
        System.out.println("0. Thoat.");
    }

    void solve() throws IOException {
        String answer;
        do {
            menu();
            System.out.println("Moi ban nhap lua chon: ");
            answer = br.readLine();

            switch (answer) {
                case "1" -> {
                    Worker worker = workerService.getWorker(br);
                    workerManger.AddWorker(worker);
                }
                case "2" -> {
                    System.out.println("Nhap muc luong tang: ");
                    double newSalary = Double.parseDouble(br.readLine());
                    workerService.upDownSalary(workerManger.getWorkers(), "up", newSalary);
                }
                case "3" -> {
                    System.out.println("Nhap muc luong giam: ");
                    double newSalary = Double.parseDouble(br.readLine());
                    workerService.upDownSalary(workerManger.getWorkers(), "down", newSalary);
                }
                case "4" -> {
                    workerService.printAllWorkerInfo(workerManger.getWorkers());
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("Dau vao khong hop le.");
            }

            System.out.println("Ban co muon tiep tuc khong(y/n): ");
            answer = br.readLine();
        } while (answer.equalsIgnoreCase("y"));

    }

    public static void main(String[] args) throws IOException {

        new WorkerApplication().solve();
    }
}
