package com.horizontallistview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import com.horizontallistview.model.Data;
import com.horizontallistview.model.Section;
import com.horizontallistview.app.R;
import com.horizontallistviewwithsections.adapter.HorizontalListViewWithSectionsAdapter;
import com.horizontallistviewwithsections.interfaces.Item;

import java.util.ArrayList;


/**
 * Created by nivedhitha.a on 9/7/2015.
 */
public class HorizontalAdapter extends HorizontalListViewWithSectionsAdapter {


    private Context context;
    private ArrayList<Item> dataList;

    public HorizontalAdapter(Context context, ArrayList<Item> dataList) {
        super(context, dataList);
        this.context = context;
        this.dataList = dataList;

    }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater =  LayoutInflater.from(viewGroup.getContext());
        Log.i("viewtype", viewType+"");
        switch(viewType){
            case 0:
                View view = inflater.inflate(R.layout.listitem_section, viewGroup, false);
                viewHolder = new SectionViewHolder(view);
                break;
            case 1:
                View v = inflater.inflate(R.layout.layout_horizontalitem, viewGroup, false);
                viewHolder = new ItemViewHolder(v);
                break;
            default:
                View vi = inflater.inflate(R.layout.listitem_section, viewGroup, false);
                viewHolder = new SectionViewHolder(vi);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


          switch (holder.getItemViewType()){
              case 0:
                  SectionViewHolder sectionViewHolder = (SectionViewHolder) holder;
                  Section section = (Section) dataList.get(position);
                  sectionViewHolder.titleTextView.setText(section.getSection());
                  break;
              case 1:
                  ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
                  Data data = (Data) dataList.get(position);
                  itemViewHolder.dataText.setText(data.getText());
                  break;
          }

    }

    @Override
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override
    public int getItemViewType(int position) {

        Item i = dataList.get(position);
        if (i.isSection()) {
            return 0;
        } else  {
            return 1;
        }

    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        public TextView dataText;
        public ImageView icon;
        public ItemViewHolder(View itemView) {
            super(itemView);
            dataText = (TextView) itemView.findViewById(R.id.meeting_textview);

        }
    }



    public class SectionViewHolder extends RecyclerView.ViewHolder{

        private TextView titleTextView;
        public SectionViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.list_item_section_text);
        }
    }











}
