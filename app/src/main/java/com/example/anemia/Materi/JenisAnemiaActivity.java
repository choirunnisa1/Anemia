package com.example.anemia.Materi;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.anemia.Adapter.JenisAdapter;
import com.example.anemia.Menu.MateriActivity;
import com.example.anemia.R;

public class JenisAnemiaActivity extends AppCompatActivity {

    private ViewPager mSlidePager ;
    private LinearLayout mDotsSlider;

    private JenisAdapter jenisAdapter;
    private TextView[] mDots;

    private Button mButtonNext;
    private Button mButtonPrev;
    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_anemia);

        mSlidePager = (ViewPager) findViewById(R.id.ViewPager);
        mDotsSlider = (LinearLayout) findViewById(R.id.dotsLayout);

        mButtonNext = (Button) findViewById(R.id.next);
        mButtonPrev = (Button) findViewById(R.id.back);

        jenisAdapter = new JenisAdapter(this);
        mSlidePager.setAdapter(jenisAdapter);

        addDotsIndicator(0);
        mSlidePager.addOnPageChangeListener(viewListener);

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlidePager.setCurrentItem(mCurrentPage + 1);
            }
        });
        mButtonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlidePager.setCurrentItem(mCurrentPage -1);
            }
        });
    }

    public void addDotsIndicator(int position){
        mDots = new TextView[5];
        mDotsSlider.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorPrimary));
            mDotsSlider.addView(mDots[i]);
        }
        if (mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.fbutton_color_concrete));
        }
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage = i;
            if (i == 0){
                mButtonNext.setEnabled(true);
                mButtonPrev.setEnabled(false);
                mButtonPrev.setVisibility(View.INVISIBLE);

                mButtonNext.setText("Next");
                mButtonPrev.setText("");
            } else if(i == mDots.length - 1){
                mButtonNext.setEnabled(true);
                mButtonPrev.setEnabled(true);
                mButtonPrev.setVisibility(View.VISIBLE);

                mButtonNext.setText("Finish");
                mButtonPrev.setText("Back");

            } else {
                mButtonNext.setEnabled(true);
                mButtonPrev.setEnabled(true);
                mButtonPrev.setVisibility(View.VISIBLE);

                mButtonNext.setText("Next");
                mButtonPrev.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
        startActivity(intent);
    }
}

