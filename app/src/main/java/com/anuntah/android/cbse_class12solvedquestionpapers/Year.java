package com.anuntah.android.cbse_class12solvedquestionpapers;

import com.shockwave.pdfium.PdfDocument;

/**
 * Created by Aman Tyagi on 23-09-2017.
 */

public class Year {

    int year =0 ;

    public int getYear() {
        return year;
    }

    //Default translation for the word
    private String YearNumber;

    public String getYearNumber() {
        return YearNumber;
    }

    private PdfDocument QuestionPaper;

    // Image displayed for word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mPDFResourceID;


    public int getImage(int year)
    {
        int resourceID=0;
        switch (year){

            case 2008:
                resourceID= R.drawable.year_2008;
                break;
            case 2009:
                resourceID= R.drawable.year_2009;
                break;
            case 2010:
                resourceID= R.drawable.year_2010;
                break;
            case 2011:
                resourceID= R.drawable.year_2011;
                break;
            case 2012:
                resourceID= R.drawable.year_2012;
                break;
            case 2013:
                resourceID= R.drawable.year_2013;
                break;
            case 2014:
                resourceID= R.drawable.year_2014;
                break;
            case 2015:
                resourceID= R.drawable.year_2015;
                break;
            case 2016:
                resourceID= R.drawable.year_2016;
                break;
            case 2017:
                resourceID= R.drawable.year_2017;
                break;


        }
        return resourceID;
    }

    public Year(int currentYear){
        year = currentYear;
        YearNumber = "Year "+currentYear;
        mImageResourceId = getImage(currentYear);
    }

    public Year(String currentYear, int ImageResourceId, int PDFResourceID){
        YearNumber = currentYear;
        mImageResourceId = ImageResourceId;
        mPDFResourceID = PDFResourceID;

    }

    public String getmCurrentYear() {

        return YearNumber;
    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }

    public int getmPDFResourceID(){
        return mPDFResourceID;
    }

    // Reads whether there is an image or not

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + YearNumber + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mPDFResourceID=" + mPDFResourceID +
                '}';
    }
}
