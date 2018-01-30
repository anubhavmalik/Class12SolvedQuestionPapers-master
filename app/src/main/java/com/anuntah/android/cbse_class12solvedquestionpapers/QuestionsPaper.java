package com.anuntah.android.cbse_class12solvedquestionpapers;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Aman Tyagi on 28-10-2017.
 */
@IgnoreExtraProperties
public class QuestionsPaper {

    public String stream;

    public QuestionsPaper() {
    }

    public QuestionsPaper(String stream, String subject, int year, String file) {

        this.stream = stream;
        this.subject = subject;
        this.year = year;
        this.file = file;
    }

    public String subject;
    public int year;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String file;
}
