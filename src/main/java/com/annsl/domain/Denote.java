package com.annsl.domain;

public class Denote {
    private Integer id;
    private String userId;
    private String denoteGood;
    private String type;
    private String time;
    private String state;

    public Denote(Integer id, String userId, String denoteGood, String type, String time, String state) {
        this.id = id;
        this.userId = userId;
        this.denoteGood = denoteGood;
        this.type = type;
        this.time = time;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Denote{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", denoteGood='" + denoteGood + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDenoteGood() {
        return denoteGood;
    }

    public void setDenoteGood(String denoteGood) {
        this.denoteGood = denoteGood;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Denote() {
    }
}
