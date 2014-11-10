package com.babel.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.babel.R;
import com.babel.fragments.NewsFragment;
import com.babel.ui.CustomActionBar;


public class MainActivity extends Activity implements View.OnClickListener {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {

            setupActionbar();

            addHomeFragment();

            setupBottombar();


        }
    }

    private void addHomeFragment() {

        getFragmentManager().beginTransaction()
                .add(R.id.main_view_mainContainer, new NewsFragment())
                .commit();
    }


    private void setupActionbar() {

        CustomActionBar customActionBar = new CustomActionBar(this, getActionBar());
        customActionBar.show();


        customActionBar.getButton1().setOnClickListener(this);
        customActionBar.getButton2().setOnClickListener(this);
        customActionBar.getButton3().setOnClickListener(this);
        customActionBar.getButton4().setOnClickListener(this);

    }


    private void setupBottombar() {

        View bottomBarContainer = (View) findViewById(R.id.main_view_bottombar_container);

        Button btnTakePicture = (Button) bottomBarContainer.findViewById(R.id.bottombar_btn_takepicture);
        btnTakePicture.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.bottombar_btn_takepicture:
                bottomBarTakePicture();
                break;

            case R.id.button1:

                actionbarToast(1);

                break;

            case R.id.button2:

                actionbarToast(2);

                break;

            case R.id.button3:

                actionbarToast(3);

                break;

            case R.id.button4:

                actionbarToast(4);

                break;

        }

    }


    private void actionbarToast(int id) {

        Toast.makeText(this, "actionbar toast = " + id, Toast.LENGTH_SHORT).show();
    }


    private void bottomBarTakePicture() {

         Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takePictureIntent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {

            Toast.makeText(this, "Tirou foto", Toast.LENGTH_SHORT).show();
        }

    }
}