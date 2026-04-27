package projects.JavaBankingSystem.repository;


import projects.JavaBankingSystem.entity.Account;

import java.util.*;

public class AccountRepository {
    private final Map<String, Account> accountByNumber = new HashMap<>();

    public void save(Account account) {
        accountByNumber.put(account.getAccountNumber(), account);
    }

    public List<Account> findAll1() {
        return new ArrayList<>(accountByNumber.values());
    }

    public Optional<Account> findByNumber(String accountNumber) {
        return Optional.ofNullable(accountByNumber.get(accountNumber));
    }

    public List<Account> findByCustomerId(String customerId) {
        List<Account> result = new ArrayList<>();
        for (Account account : accountByNumber.values()) {
            if (account.getCustomerId().equals(customerId)) {
                result.add(account);
            }
        }
        return result;
    }

}
