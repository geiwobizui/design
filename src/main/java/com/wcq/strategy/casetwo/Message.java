package com.wcq.strategy.casetwo;

public class Message {
    private int code;
    private Object data;
    private String result;

    public Message(int code, Object data, String result) {
        this.code = code;
        this.data = data;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", data=" + data +
                ", result='" + result + '\'' +
                '}';
    }
}
