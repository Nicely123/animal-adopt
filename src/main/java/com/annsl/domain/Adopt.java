package com.annsl.domain;

public class Adopt {
    private Integer id;
    private String userId;
    private String petId;
    private String adoptTime;
    private String state;

    public Adopt() {
    }

    public Adopt(Integer id, String userId, String petId, String adoptTime, String state) {
        this.id = id;
        this.userId = userId;
        this.petId = petId;
        this.adoptTime = adoptTime;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adopt{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", petId='" + petId + '\'' +
                ", adoptTime='" + adoptTime + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public void setAdoptTime(String adoptTime) {
        this.adoptTime = adoptTime;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPetId() {
        return petId;
    }

    public String getAdoptTime() {
        return adoptTime;
    }

    public String getState() {
        return state;
    }
}
