package com.metaformsystems.integral.test.spring;

/**
 *
 */
public class ClientService {
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void invoke() {

    }
}
