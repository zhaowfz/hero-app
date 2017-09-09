package com.cn.beans;

/**
 * Created by ynzha on 2017/8/29.
 */
public class Result {
    private int stateCode;
    private String message;

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(int stateCode, String message) {
        this.stateCode = stateCode;
        this.message = message;
    }
}
