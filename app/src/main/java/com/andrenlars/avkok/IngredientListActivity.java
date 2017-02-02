package com.andrenlars.avkok;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IngredientListActivity extends ListActivity {

    static final String[] INGREDIENTS = new String[] { "Avocado", "Banana",
            "Blueberry", "Cucumber", "Cheese", "Egg", "",
            "Jalapenos", "Mango", "Olives", "Potato", "Pasta", "Yoghurt" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_ingredient_list);

        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_ingredient_list, INGREDIENTS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
    }
}
