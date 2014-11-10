package com.babel.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;

import com.babel.R;
import com.babel.adapters.NewsAdapter;
import com.babel.models.News;
import com.nhaarman.listviewanimations.appearance.AnimationAdapter;


import com.nhaarman.listviewanimations.appearance.simple.SwingBottomInAnimationAdapter;


import java.util.ArrayList;


public class NewsFragment extends Fragment {

    private ListView listView;
    private NewsAdapter newsAdapter;
    private AnimationAdapter animationAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_news, container, false);

        listView = (ListView) v.findViewById(R.id.news_listview);

        ArrayList<News> newsArrayList = new ArrayList<News>();


        for (int i = 0; i < 10; i++) {
            News news = new News();
            newsArrayList.add(news);
        }


        newsAdapter = new NewsAdapter(getActivity(), newsArrayList);

        animationAdapter = new SwingBottomInAnimationAdapter(newsAdapter);
        animationAdapter.setAbsListView(listView);
        listView.setAdapter(animationAdapter);


        return v;

    }


}
