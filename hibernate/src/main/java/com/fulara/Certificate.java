package com.fulara;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private String duration;
    private String taughtBy;

    public Certificate() {
        super();
    }

    public Certificate(String course, String duration, String taughtBy) {
        super();
        this.course = course;
        this.duration = duration;
        this.taughtBy = taughtBy;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTaughtBy() {
        return taughtBy;
    }

    public void setTaughtBy(String taughtBy) {
        this.taughtBy = taughtBy;
    }


}
