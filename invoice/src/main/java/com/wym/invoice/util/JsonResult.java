package com.wym.invoice.util;

import java.io.Serializable;

public class JsonResult<E> implements Serializable {

    private Integer state;

    private String message;

    private E data;

    public JsonResult(){}

    public JsonResult(Throwable e){
        this.message = e.getMessage();
    }

    public JsonResult(Integer state){
        this.state = state;
    }

    public JsonResult(Integer state, E Data){
        this.state = state;
        this.data = Data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}