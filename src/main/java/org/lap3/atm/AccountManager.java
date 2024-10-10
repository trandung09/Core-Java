package org.lap3.atm;

import java.util.List;

public class AccountManager {

    private static final List<Account> accounts = List.of(
            new Account("techmaster", "hoclacoviec", 1000000),
            new Account("aqwert", "asdghlo", 20000000)
            // ... more account
    );

    public static boolean addAccount(Account account) {
        if (account == null)
            return false;

        return accounts.add(account);
    }

    public static boolean removeAccount(Account account) {
        if (account == null)
            return false;

        return accounts.remove(account);
    }

    public static Account findAccount(String username, String password) {
        return accounts.stream()
                .filter(a -> a.getUsername().equalsIgnoreCase(username)
                        && a.getPassword().equalsIgnoreCase(password))
                .findFirst().orElse(null);
    }
}
