package org.lap3.atm;

import lombok.Data;

import java.util.Objects;

@Data
public class Account {

    private final String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(username, account.username) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, balance);
    }

    @Override
    public String toString() {
        return "Your account info: \n\t\t" +
                "Username: " + username + "\n\t\t" +
                "Balance: " + balance + "\n";

        // can use string builder...
    }
}
