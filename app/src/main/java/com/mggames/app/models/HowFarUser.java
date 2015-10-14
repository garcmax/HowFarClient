package com.mggames.app.models;

import java.util.Date;

/**
 * Created by Niwa on 14/10/2015.
 */
public class HowFarUser {

    private String login;
    private String password;
    private Date creationDate;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
