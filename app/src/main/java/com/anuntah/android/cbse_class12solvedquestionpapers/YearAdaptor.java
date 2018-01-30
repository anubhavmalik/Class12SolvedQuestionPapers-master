package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 23-09-2017.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aman Tyagi on 21-08-2017.
 */


public class YearAdaptor extends ArrayAdapter<Year> {


    private int mColorResourceId;
    public YearAdaptor(Activity context, ArrayList<Year> years,int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, years);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_years, parent, false);
        }



        // Get the {@link AndroidFlavor} object located at this position in the list
        Year currentYear = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultYear = (TextView) listItemView.findViewById(R.id.year_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        if (currentYear != null) {
            defaultYear.setText(currentYear.getmCurrentYear());
        }

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentYear.hasImage()){
            iconView.setImageResource(currentYear.getmImageResourceId());

            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        // Set the theme color foor the list of words
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
