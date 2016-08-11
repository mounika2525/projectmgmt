package com.iic.model;

/**
 * Created by mounika on 11/08/16.
 */
public class Status {
    private int statusCode;
    private String msg;


    public Status(int statusCode, String msg) {
        super();
        this.statusCode = statusCode;
        this.msg = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Status()
    {
        super();
    }
}
