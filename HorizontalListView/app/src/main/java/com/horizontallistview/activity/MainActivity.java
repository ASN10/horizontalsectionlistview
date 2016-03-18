package com.horizontallistview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import com.horizontallistview.adapter.HorizontalAdapter;
import com.horizontallistview.app.R;


import com.horizontallistview.model.Data;
import com.horizontallistview.model.Section;
import com.horizontallistviewwithsections.interfaces.Item;
import com.horizontallistviewwithsections.utils.ListViewUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Item> dataList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        setDataSource();
        setAdapter();

    }


    private void setDataSource(){
        dataList = new ArrayList<Item>();
        Section section = new Section();
        Log.i("isSection", section.isSection() + "");
        section.setSection("January");
        dataList.add(section);
        Data data = new Data();
        data.setText("Board Meeting");
        dataList.add(data);
        Data data1 = new Data();
        data1.setText("Business Conference");
        dataList.add(data1);
        Section section1 = new Section();
        section1.setSection("February");
        dataList.add(section1);
        Data data2 = new Data();
        data2.setText("Conference");
        dataList.add(data2);
        Data data3 = new Data();
        data3.setText("Discussion");
        dataList.add(data3);
        Data data4 = new Data();
        data4.setText("Directors Meeting");
        dataList.add(data4);
        Data data5 = new Data();
        data5.setText("Forum");
        dataList.add(data5);
        Section section2 = new Section();
        section2.setSection("March");
        dataList.add(section1);
        Data data6 = new Data();
        data6.setText("Board Meeting");
        dataList.add(data6);
        Data data7 = new Data();
        data7.setText("External Meeting");
        dataList.add(data7);
        Data data8 = new Data();
        data8.setText("Analysis Discussion");
        dataList.add(data8);
        Section section3 = new Section();
        Log.i("isSection", section.isSection() + "");
        section3.setSection("April");
        dataList.add(section3);
        Data data9 = new Data();
        data9.setText("Vacation");
        dataList.add(data9);
        Data data10 = new Data();
        data10.setText("Fun Activity");
        dataList.add(data10);
        Section section4 = new Section();
        section4.setSection("May");
        dataList.add(section4);
        Data data11 = new Data();
        data11.setText("Meeting");
        dataList.add(data11);
        Data data12 = new Data();
        data12.setText("Conference");
        dataList.add(data12);
        Data data13 = new Data();
        data13.setText("Conference");
        dataList.add(data13);
        Data data14 = new Data();
        data14.setText("Product launch");
        dataList.add(data14);
        Section section5 = new Section();
        section5.setSection("June");
        dataList.add(section5);
        Data data15 = new Data();
        data15.setText("Team Outing");
        dataList.add(data15);
        Data data16 = new Data();
        data16.setText("Conference");
        dataList.add(data16);
        Data data17 = new Data();
        data17.setText("Discussion");
        dataList.add(data17);
     }



    private void setAdapter(){
        HorizontalAdapter horizontalAdapter = new HorizontalAdapter(this, dataList);
        ListViewUtils.setAdpater(this, recyclerView, horizontalAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
