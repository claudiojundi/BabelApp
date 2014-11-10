package com.babel.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.babel.R;
import com.babel.models.News;
import com.nhaarman.listviewanimations.appearance.StickyListHeadersAdapterDecorator;
import com.nhaarman.listviewanimations.itemmanipulation.swipedismiss.undo.UndoAdapter;
import com.nhaarman.listviewanimations.util.StickyListHeadersListViewWrapper;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jundisassaki on 11/8/14.
 */

//StickyListHeadersAdapter
public class NewsAdapter extends BaseAdapter implements UndoAdapter {

    private Context context;
    private ArrayList<News> newsArrayList;


    private boolean rowLoaded;

    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        this.context = context;
        this.newsArrayList = newsArrayList;
    }

    @Override
    public int getCount() {
        return newsArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        View view = convertView;

//        if (view == null) {
//
//            view = (View) LayoutInflater.from(context).inflate(R.layout.row_news_type_0, viewGroup, false);
//
//            viewHolder = new ViewHolder();
//            //viewHolder.textView = (TextView) view.findViewById(R.id.activity_googlecards_card_textview);
//            view.setTag(viewHolder);
//
//        }

        // viewHolder.textView.setText(mContext.getString(R.string.card_number, getItem(position) + 1));
        //setImageView(viewHolder, position);

        return view;

    }

    @Override
    public View getUndoView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getUndoClickView(View view) {
        return null;
    }

    private static class ViewHolder {

    }

    private static class ViewHolder2 {

    }

}
