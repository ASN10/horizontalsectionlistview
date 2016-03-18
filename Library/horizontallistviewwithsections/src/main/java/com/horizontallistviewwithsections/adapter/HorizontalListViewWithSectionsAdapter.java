package com.horizontallistviewwithsections.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;


import com.horizontallistviewwithsections.interfaces.Item;

import java.util.ArrayList;

/**
 * Created by nivedhitha.a on 9/23/2015.
 */
public abstract class HorizontalListViewWithSectionsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /**
     * method to set data source to the adapter.
     * @param context
     * @param dataList
     */

    public HorizontalListViewWithSectionsAdapter(Context context, ArrayList<Item> dataList){
        super();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 0;
    }


    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
