/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake> earthquakes = new ArrayList<>();
        earthquakes.add(new EarthQuake(R.string.Quake_mag_1, R.string.Quake_loc_1, R.string.Quake_dat_1));
        earthquakes.add(new EarthQuake(R.string.Quake_mag_2, R.string.Quake_loc_2, R.string.Quake_dat_2));
        earthquakes.add(new EarthQuake(R.string.Quake_mag_3, R.string.Quake_loc_3, R.string.Quake_dat_3));
        earthquakes.add(new EarthQuake(R.string.Quake_mag_4, R.string.Quake_loc_4, R.string.Quake_dat_4));
        earthquakes.add(new EarthQuake(R.string.Quake_mag_5, R.string.Quake_loc_5, R.string.Quake_dat_5));
        earthquakes.add(new EarthQuake(R.string.Quake_mag_6, R.string.Quake_loc_6,R.string.Quake_dat_6));
        earthquakes.add(new EarthQuake(R.string.Quake_mag_7, R.string.Quake_loc_7, R.string.Quake_dat_7));


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        QuakAdapter adapter = new QuakAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
