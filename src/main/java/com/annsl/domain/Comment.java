package com.annsl.domain;

public class Comment {
    private Integer id;
    private String userId;
    private String petId;
    private String time;
    private String content;

    public Comment() {
    }

    public Comment(Integer id, String userId, String petId, String time, String content) {
        this.id = id;
        this.userId = userId;
        this.petId = petId;
        this.time = time;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", petId='" + petId + '\'' +
                ", time='" + time + '\'' +
                ", content='" + content + '\'' +
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

    public void setTime(String time) {
        this.time = time;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }
}
