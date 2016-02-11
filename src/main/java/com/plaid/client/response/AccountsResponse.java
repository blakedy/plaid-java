package com.plaid.client.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AccountsResponse extends PlaidUserResponse implements Serializable {

    protected List<Account> accounts;
    
    public List<Account> getAccounts() {
        return accounts;
    }
    
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
