package com.example.myjavaweb;

public class ChatItem {
    private String otherMsg;
    private String myMsg;

    public ChatItem(String otherMsg, String myMsg) {
        this.otherMsg = otherMsg;
        this.myMsg = myMsg;
    }


    public String getOtherMsg() {
        return otherMsg;
    }

    public String getMyMsg() {
        return myMsg;
    }
}
