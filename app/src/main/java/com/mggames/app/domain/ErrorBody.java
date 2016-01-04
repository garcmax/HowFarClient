package com.mggames.app.domain;

/**
 * Created by Maxou on 21/10/2015.
 */
public class ErrorBody {

    private String error;

    public String getError() {
        return error;
    }

    public ErrorBody(String error) {
        this.error = error;
    }

    public void setError(String error) {
        this.error = error;

    }
}
