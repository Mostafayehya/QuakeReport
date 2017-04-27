package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mostafayehya on 26/04/17.
 */

public class QuakAdapter extends ArrayAdapter<EarthQuake> {


    public QuakAdapter(Context context ,ArrayList<EarthQuake> itemlist){

        super(context,0,itemlist);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitem = convertView;

        if(listitem ==null){
            listitem= LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }

        EarthQuake currentQuak = getItem(position);

        TextView magnitudeView = (TextView) listitem.findViewById(R.id.magnitude_text_view);
        magnitudeView.setText(currentQuak.getQuakeMagnitude());

        TextView locationView = (TextView) listitem.findViewById(R.id.location_text_view);
        locationView.setText(currentQuak.getLocation());

        TextView datView = (TextView) listitem.findViewById(R.id.date_text_view);
        datView.setText(currentQuak.getDate());

        return listitem;
    }


}
