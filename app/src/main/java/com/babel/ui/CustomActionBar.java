package com.babel.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;


import android.widget.Button;
import android.widget.SpinnerAdapter;

import lombok.Data;

import com.babel.R;


/**
 * TODO: document your custom view class.
 */

@Data
public class CustomActionBar extends ActionBar {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    public CustomActionBar(Activity activity, ActionBar actionBar) {

        setupCustomActionBar(activity, actionBar);
    }

    private void setupCustomActionBar(Activity activity, ActionBar actionBar) {

        ViewGroup actionBarLayout = (ViewGroup) activity.getLayoutInflater().inflate(R.layout.view_actionbar, null);

        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setHomeButtonEnabled(false);

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(actionBarLayout);

        setupActionBarButtons(actionBarLayout);
    }

    private void setupActionBarButtons(ViewGroup actionBarLayout) {


        button1 = (Button) actionBarLayout.findViewById(R.id.button1);
        button2 = (Button) actionBarLayout.findViewById(R.id.button2);
        button3 = (Button) actionBarLayout.findViewById(R.id.button3);
        button4 = (Button) actionBarLayout.findViewById(R.id.button4);

        //        ImageView imgConfig = (ImageView) actionBar.getCustomView().findViewById(R.id.actionbar_img_config);
//        imgConfig.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                toogleBallonVisibility();
//
//            }
//
//        });

    }

    @Override
    public void setCustomView(View view) {

    }

    @Override
    public void setCustomView(View view, LayoutParams layoutParams) {

    }

    @Override
    public void setCustomView(int i) {

    }

    @Override
    public void setIcon(int i) {

    }

    @Override
    public void setIcon(Drawable drawable) {

    }

    @Override
    public void setLogo(int i) {

    }

    @Override
    public void setLogo(Drawable drawable) {

    }

    @Override
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, OnNavigationListener onNavigationListener) {

    }

    @Override
    public void setSelectedNavigationItem(int i) {

    }

    @Override
    public int getSelectedNavigationIndex() {
        return 0;
    }

    @Override
    public int getNavigationItemCount() {
        return 0;
    }

    @Override
    public void setTitle(CharSequence charSequence) {

    }

    @Override
    public void setTitle(int i) {

    }

    @Override
    public void setSubtitle(CharSequence charSequence) {

    }

    @Override
    public void setSubtitle(int i) {

    }

    @Override
    public void setDisplayOptions(int i) {

    }

    @Override
    public void setDisplayOptions(int i, int i2) {

    }

    @Override
    public void setDisplayUseLogoEnabled(boolean b) {

    }

    @Override
    public void setDisplayShowHomeEnabled(boolean b) {

    }

    @Override
    public void setDisplayHomeAsUpEnabled(boolean b) {

    }

    @Override
    public void setDisplayShowTitleEnabled(boolean b) {

    }

    @Override
    public void setDisplayShowCustomEnabled(boolean b) {

    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {

    }

    @Override
    public View getCustomView() {
        return null;
    }

    @Override
    public CharSequence getTitle() {
        return null;
    }

    @Override
    public CharSequence getSubtitle() {
        return null;
    }

    @Override
    public int getNavigationMode() {
        return 0;
    }

    @Override
    public void setNavigationMode(int i) {

    }

    @Override
    public int getDisplayOptions() {
        return 0;
    }

    @Override
    public Tab newTab() {
        return null;
    }

    @Override
    public void addTab(Tab tab) {

    }

    @Override
    public void addTab(Tab tab, boolean b) {

    }

    @Override
    public void addTab(Tab tab, int i) {

    }

    @Override
    public void addTab(Tab tab, int i, boolean b) {

    }

    @Override
    public void removeTab(Tab tab) {

    }

    @Override
    public void removeTabAt(int i) {

    }

    @Override
    public void removeAllTabs() {

    }

    @Override
    public void selectTab(Tab tab) {

    }

    @Override
    public Tab getSelectedTab() {
        return null;
    }

    @Override
    public Tab getTabAt(int i) {
        return null;
    }

    @Override
    public int getTabCount() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public boolean isShowing() {
        return false;
    }

    @Override
    public void addOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener) {

    }

    @Override
    public void removeOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener) {

    }
}
