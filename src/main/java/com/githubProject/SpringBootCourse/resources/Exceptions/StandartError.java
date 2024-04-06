package com.githubProject.SpringBootCourse.resources.Exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandartError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timeStemp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandartError() {
    }

    public StandartError(Instant timeStemp, Integer status, String error, String message, String path) {
        this.timeStemp = timeStemp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimeStemp() {
        return timeStemp;
    }

    public void setTimeStemp(Instant timeStemp) {
        this.timeStemp = timeStemp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
