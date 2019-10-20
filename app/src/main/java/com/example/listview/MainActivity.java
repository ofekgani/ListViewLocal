package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Ofek Gani on 16/10/2019
 * @author ofek gani
 * @version 0.2
 * @since 16/10
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    Button button;
    String[] Continents = {"America", "Europe", "Asia", "Africa"};
    int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        button = findViewById(R.id.btn_next);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,Continents);
        listView.setAdapter(adp);

        listView.setOnItemClickListener(this);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast toast = Toast.makeText(this,""+Continents[i],Toast.LENGTH_SHORT);
        toast.show();
        choice = i;

    }

    /**
     *
     * @param view Once you click on the button "button"
     */
    public void next(View view) {
        Intent si = new Intent(this, CountryListActivity.class);
        si.putExtra("choice",choice);
        startActivity(si);

    }
}
