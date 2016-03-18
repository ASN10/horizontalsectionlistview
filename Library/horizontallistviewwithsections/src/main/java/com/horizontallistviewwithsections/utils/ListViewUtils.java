package com.horizontallistviewwithsections.utils;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.horizontallistviewwithsections.adapter.HorizontalListViewWithSectionsAdapter;
import com.horizontallistviewwithsections.interfaces.Item;

import java.util.ArrayList;

/**
 * Created by nivedhitha.a on 9/23/2015.
 */
public class ListViewUtils {


    public static void setAdpater(Context context,RecyclerView listview, HorizontalListViewWithSectionsAdapter adapter){
        LinearLayoutManager man = new LinearLayoutManager(context);
        man.setOrientation(LinearLayoutManager.HORIZONTAL);
        listview.setLayoutManager(man);
        listview.setAdapter(adapter);


    }

}
