package com.example.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent gi;
    String choice;
    String[] countriesList;

    Button button;
    ListView listView;
    TextView tv_CapitalCity, tv_Population;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gi = getIntent();
        choice = gi.getStringExtra("n");

        button = findViewById(R.id.btn_back);
        listView = findViewById(R.id.listView);
        tv_CapitalCity = findViewById(R.id.tv_capitalView);
        tv_Population = findViewById(R.id.tv_population);

        if(choice.equals("Europe")){
            countriesList = new String[]{"London", "France", "Bulgaria"};
        }

        if(choice.equals("Asia")){
            countriesList = new String[]{"Japan", "Thailand", "India"};
        }

        if(choice.equals("America")){
            countriesList = new String[]{"Canada", "United States", "Brazil"};
        }

        if(choice.equals("Africa")){
            countriesList = new String[]{"Morocco", "Uganda", "Mali"};
        }

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,countriesList);
        listView.setAdapter(adp);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(choice.equals("Africa")){

        }
    }

    public void back(View view) {
        finish();
    }
}
