package org.lap2.accounts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

public class AccountApplication {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final List<Account> accounts = List.of(
            new Account("techmaster", "hoclacoviec", 1000000)
            // ... more account
    );

    private Account login(String username, String password) {

        return accounts.stream()
                .filter(a -> a.getUsername().equals(username) && a.getPassword().equals(password))
                .findFirst().orElse(null);
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
            return String.format("You have successfully withdrawn %.2f VND at %s", money, now.toString());
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

                if (answer.equals("n")) {
                    return;
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

            if (answer.equals("1")) {
                System.out.println(showAccountInfo(account));
            }
            else if (answer.equals("2")){
                System.out.print("Please enter the amount you want to withdraw: ");
                double money = Double.parseDouble(br.readLine());
                System.out.println(withdrawMoney(account, money));
            }

            System.out.print("Do you want to continue? (y/n): ");
            answer = br.readLine();

        } while (!answer.equals("n"));
    }

    public static void main(String[] args) throws IOException {

        new AccountApplication().application();
    }
}
