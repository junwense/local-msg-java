package com.meoying.localmessage.v4.core.exception;

public class MessageException extends BaseException {

    public MessageException(Throwable e) {
        super(e);
    }

    public MessageException(String msg) {
        super(msg);
    }

    public MessageException(String msg, Throwable e) {
        super(msg, e);
    }
}
