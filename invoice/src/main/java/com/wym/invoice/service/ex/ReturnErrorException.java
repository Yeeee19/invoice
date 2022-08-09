package com.wym.invoice.service.ex;

public class ReturnErrorException extends ServiceException{
    public ReturnErrorException() {
        super();
    }

    public ReturnErrorException(String message) {
        super(message);
    }

    public ReturnErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReturnErrorException(Throwable cause) {
        super(cause);
    }

    protected ReturnErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
