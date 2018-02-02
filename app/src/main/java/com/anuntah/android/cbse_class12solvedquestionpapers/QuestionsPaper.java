package com.anuntah.android.cbse_class12solvedquestionpapers;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
 * Created by Aman Tyagi on 28-10-2017.
 */
@IgnoreExtraProperties
public class QuestionsPaper implements Serializable {

    public String stream;
    public String subject;
    public String year;
    public String file;


    public QuestionsPaper() {
    }



    public QuestionsPaper(String stream, String subject, String year, String file) {



        this.stream = stream;
        this.subject = subject;
        this.year = year;
        this.file = file;
    }



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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}
