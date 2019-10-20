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

/**
 * Created by Ofek Gani on 16/10/2019
 * @author ofek gani
 * @version 0.2
 * @since 16/10
 */
public class CountryListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent gi;
    int choice;
    String continent;
    String[] countriesList;
    Button button;
    ListView listView;
    TextView tv_CapitalCity, tv_Population;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        gi = getIntent();
        choice = gi.getIntExtra("choice",0);

        button = findViewById(R.id.btn_back);
        listView = findViewById(R.id.listView);
        tv_CapitalCity = findViewById(R.id.tv_capitalView);
        tv_Population = findViewById(R.id.tv_population);

        listView.setOnItemClickListener(this);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,getListCountries());
        listView.setAdapter(adp);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        getInformation(i);

    }

    /**
     *
     * @param view Once you click on the button "button"
     */
    public void back(View view) {
        finish();
    }

    /**
     *
     * @return List of countries by continent
     */
    private String[] getListCountries(){
        switch (choice){
            case 0:
                continent = "America";
                countriesList = new String[]{"Canada", "United States", "Brazil", "Mexico", "Argentina", "Chile", "Colombia"};
                break;
            case 1:
                continent = "Europe";
                countriesList = new String[]{"Anglia", "France", "Bulgaria", "Italy", "Germany", "Spain", "Greece"};
                break;
            case 2:
                continent = "Asia";
                countriesList = new String[]{"Japan", "Thailand", "India", "Russia", "Georgia", "Israel", "Turkey"};
                break;
            case 3:
                continent = "Africa";
                countriesList = new String[]{"Morocco", "Uganda", "Mali", "Kenya", "Sudan", "Nigeria", "Liberia"};
                break;
        }
        return countriesList;
    }

    /*private int getListCountries(int slot) {
        return getListCountries()[slot];
    }*/

    /**
     *
     * @param slot The position of the state in the array
     */
    private void getInformation(int slot){
        switch (choice){
            case 0:
                switch(slot){
                    case 0:
                        tv_Population.setText("Population: 37,602,103 ");
                        tv_CapitalCity.setText("Capital City: Ottawa");
                        break;
                    case 1:
                        tv_Population.setText("Population: 327,167,434 ");
                        tv_CapitalCity.setText("Capital City: Washington");
                        break;
                    case 2:
                        tv_Population.setText("Population: 210,147,125 ");
                        tv_CapitalCity.setText("Capital City: Brasília");
                        break;
                    case 3:
                        tv_Population.setText("Population: 126,577,691 ");
                        tv_CapitalCity.setText("Capital City: Mexico City");
                        break;
                    case 4:
                        tv_Population.setText("Population: 44,938,712 ");
                        tv_CapitalCity.setText("Capital City: Buenos Aires");
                        break;
                    case 5:
                        tv_Population.setText("Population: 17,574,003 ");
                        tv_CapitalCity.setText("Capital City: Santiago");
                        break;
                    case 6:
                        tv_Population.setText("Population: 48,258,494 ");
                        tv_CapitalCity.setText("Capital City: Bogotá");
                        break;
                }
                break;
            case 1:
                switch(slot){
                    case 0:
                        tv_Population.setText("Population: 53,012,456 ");
                        tv_CapitalCity.setText("Capital City: London");
                        break;
                    case 1:
                        tv_Population.setText("Population: 67,364,357 ");
                        tv_CapitalCity.setText("Capital City: Paris");
                        break;
                    case 2:
                        tv_Population.setText("Population: 7,057,504 ");
                        tv_CapitalCity.setText("Capital City: Sofia");
                        break;
                    case 3:
                        tv_Population.setText("Population: 60,483,973 ");
                        tv_CapitalCity.setText("Capital City: Rome");
                        break;
                    case 4:
                        tv_Population.setText("Population: 83,019,200 ");
                        tv_CapitalCity.setText("Capital City: Berlin");
                        break;
                    case 5:
                        tv_Population.setText("Population: 46,733,038 ");
                        tv_CapitalCity.setText("Capital City: Madrid");
                        break;
                    case 6:
                        tv_Population.setText("Population: 10,768,477 ");
                        tv_CapitalCity.setText("Capital City: Athens");
                        break;
                }
                break;
            case 2:
                switch(slot){
                    case 0:
                        tv_Population.setText("Population: 126,317,000 ");
                        tv_CapitalCity.setText("Capital City: Tokyo");
                        break;
                    case 1:
                        tv_Population.setText("Population: 68,863,514 ");
                        tv_CapitalCity.setText("Capital City: Bangkok");
                        break;
                    case 2:
                        tv_Population.setText("Population: 1,324,171,354");
                        tv_CapitalCity.setText("Capital City: New Delhi");
                        break;
                    case 3:
                        tv_Population.setText("Population: 146,793,744 ");
                        tv_CapitalCity.setText("Capital City: Moscow");
                        break;
                    case 4:
                        tv_Population.setText("Population: 3,723,500 ");
                        tv_CapitalCity.setText("Capital City: Tbilisi");
                        break;
                    case 5:
                        tv_Population.setText("Population: 9,085,970 ");
                        tv_CapitalCity.setText("Capital City: Jerusalem");
                        break;
                    case 6:
                        tv_Population.setText("Population: 82,003,882 ");
                        tv_CapitalCity.setText("Capital City: Ankara");
                        break;
                }
                break;
            case 3:
                switch(slot){
                    case 0:
                        tv_Population.setText("Population: 35,740,000 ");
                        tv_CapitalCity.setText("Capital City: Rabat");
                        break;
                    case 1:
                        tv_Population.setText("Population: 41,487,965 ");
                        tv_CapitalCity.setText("Capital City: Kampala");
                        break;
                    case 2:
                        tv_Population.setText("Population: 19,329,841 ");
                        tv_CapitalCity.setText("Capital City: Bamako");
                        break;
                    case 3:
                        tv_Population.setText("Population: 49,364,325 ");
                        tv_CapitalCity.setText("Capital City: Nairobi");
                        break;
                    case 4:
                        tv_Population.setText("Population: 41,592,539 ");
                        tv_CapitalCity.setText("Capital City: Khartoum");
                        break;
                    case 5:
                        tv_Population.setText("Population: 200,962,417 ");
                        tv_CapitalCity.setText("Capital City: Abuja");
                        break;
                    case 6:
                        tv_Population.setText("Population: 4,503,000 ");
                        tv_CapitalCity.setText("Capital City: Monrovia");
                        break;
                }
                break;

        }
    }
}

