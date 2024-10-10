package org.lap3.atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class AccountApplication {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private Account login(String username, String password) {

        return AccountManager.findAccount(username, password);
    }

    private void menu() {
        System.out.println("1. View account information.");
        System.out.println("2. Withdraw money.");
    }

    private String showAccountInfo(Account account) {

        return account.toString();
    }

    private String withdrawMoney(Account account, double money) {
        if (money > account.getBalance()) {
            return "You don't have enough money.";
        }
        else {
            account.setBalance(account.getBalance() - money);
            LocalDate now = LocalDate.now();
            return String.format("You have successfully withdrawn %.2f VND at %s", money, now);
        }
    }

    public void application() throws IOException {

        String username, password, answer;
        Account account;

        while (true) {
            System.out.print("Please enter your username: ");
            username = br.readLine();
            System.out.print("Please enter your password: ");
            password = br.readLine();

            account = login(username, password);

            if (account == null) {
                System.out.println("Login failed.");
                System.out.print("Do you want to continue? (y/n): ");
                answer = br.readLine();

                if (answer.equalsIgnoreCase("n")) {
                    System.exit(1);
                    // return
                }
            }
            else {
                break;
            }
        }

        do {
            menu();
            System.out.print("Please enter your choose: ");
            answer = br.readLine();

            switch (answer) {
                case "1":
                    System.out.println(showAccountInfo(account));
                    break;
                case "2":
                    System.out.print("Please enter the amount you want to withdraw: ");
                    double money = Double.parseDouble(br.readLine());
                    System.out.println(withdrawMoney(account, money));
                    break;
                default:
                    System.out.println("Invalid input.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            answer = br.readLine();

        } while (answer.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) throws IOException {

        new AccountApplication().application();
    }
}
