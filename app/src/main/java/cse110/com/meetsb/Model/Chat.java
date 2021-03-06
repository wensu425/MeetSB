package cse110.com.meetsb.Model;

import android.net.Uri;

import java.io.Serializable;

public class Chat implements Serializable{
    private String userId;
    private String lastmessage;
    private String time;
    private String username;

    public Chat(){}

    public Chat(String userId, String lastmessage, String time, String username) {
        this.userId = userId;
        this.lastmessage = lastmessage;
        this.time = time;
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
