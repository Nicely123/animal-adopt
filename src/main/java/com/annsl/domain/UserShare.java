package com.annsl.domain;

public class UserShare {
    private Integer id;
    private String userId;
    private String petId;
    private String time;
    private String state;

    public UserShare(Integer id, String userId, String petId, String time, String state) {
        this.id = id;
        this.userId = userId;
        this.petId = petId;
        this.time = time;
        this.state = state;
    }

    public UserShare() {
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

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
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

    @Override
    public String toString() {
        return "UserShare{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", petId='" + petId + '\'' +
                ", time='" + time + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
