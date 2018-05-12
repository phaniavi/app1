package com.phaniavi.phani.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String[] summerCandidates = {"phanindra", "siddhartha", "sai Krishna", "Abhishek",
                "Nivyanth", "Riteesh", "Bhanu Prakash", "Maheshwar"};
        final ListAdapter theAdapter = new ArrayAdapter<>(this, R.layout.row_layout, summerCandidates);
        ListView theListView = findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCandidate = "You Selected " + String.valueOf(theAdapter.getItem(position));
                Toast.makeText(Main3Activity.this, selectedCandidate, Toast.LENGTH_LONG).show();
            }
        });
    }
}
