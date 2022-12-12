package com.annsl.domain;

public class Log {
    private Integer id;
    private String content;
    private String time;

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Log(Integer id, String content, String time) {
        this.id = id;
        this.content = content;
        this.time = time;
    }

    public Log() {
    }
}
