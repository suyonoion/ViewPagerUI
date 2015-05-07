package com.suyonoion.viewpagerui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ganteng extends Activity implements OnClickListener {

    private List<View> tampildaftarHalaman;
    private SuyonoPagerAdapter iloveyou;
    private ViewPager SuyonoViewPager;
    private ImageButton fotoImg0;
    private ImageButton fotoImg1;
    private ImageButton fotoImg2;
    private ImageButton fotoImg3;
    private ImageButton fotoImg4;
    private LinearLayout linearLayout0;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;

    private static final int SUYONOION_0 = 0;
    private static final int SUYONOION_1 = 1;
    private static final int SUYONOION_2 = 2;
    private static final int SUYONOION_3 = 3;
    private static final int SUYONOION_4 = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ganteng);
        intiView();
        getClickEvent();
        SuyonoViewPager.setCurrentItem(2);
        NotifikasiSelamat();

    }

private void NotifikasiSelamat() {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.notif,
                (ViewGroup) findViewById(R.id.ambilnotif));

        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setGravity(Gravity.TOP, 0,0);
        toast.show();
    }

    private void intiView() {


        SuyonoViewPager = (ViewPager) findViewById(R.id.viewpager);

        tampildaftarHalaman = new ArrayList<View>();
        tampildaftarHalaman.add(LayoutInflater.from(this).inflate(R.layout.halaman0, null));
        tampildaftarHalaman.add(LayoutInflater.from(this).inflate(R.layout.halaman1, null));
        tampildaftarHalaman.add(LayoutInflater.from(this).inflate(R.layout.halaman2, null));
        tampildaftarHalaman.add(LayoutInflater.from(this).inflate(R.layout.halaman3, null));
        tampildaftarHalaman.add(LayoutInflater.from(this).inflate(R.layout.halaman4, null));

        iloveyou = new SuyonoPagerAdapter(tampildaftarHalaman);
        SuyonoViewPager.setAdapter(iloveyou);

        // Definisi Foto dan Linear
        fotoImg0 = (ImageButton) findViewById(R.id.public_img0);
        fotoImg1 = (ImageButton) findViewById(R.id.public_img1);
        fotoImg2 = (ImageButton) findViewById(R.id.public_img2);
        fotoImg3 = (ImageButton) findViewById(R.id.public_img3);
        fotoImg4 = (ImageButton) findViewById(R.id.public_img4);

        linearLayout0 = (LinearLayout) findViewById(R.id.public_linear0);
        linearLayout1 = (LinearLayout) findViewById(R.id.public_linear1);
        linearLayout2 = (LinearLayout) findViewById(R.id.public_linear2);
        linearLayout3 = (LinearLayout) findViewById(R.id.public_linear3);
        linearLayout4 = (LinearLayout) findViewById(R.id.public_linear4);

    }

    public void ion1 (View hal1)
    {
        SuyonoViewPager.setCurrentItem(0);

    }
    public void ion2 (View hal2)
    {
        SuyonoViewPager.setCurrentItem(1);

    }
    public void ion3 (View hal3)
    {
        SuyonoViewPager.setCurrentItem(2);

    }
    public void ion4 (View hal4)
    {
        SuyonoViewPager.setCurrentItem(3);

    }
    public void ion5 (View hal5)
    {
        SuyonoViewPager.setCurrentItem(4);

    }

    @Override
    public void onClick(View v) {
        setImg();
        switch (v.getId()) {
            case R.id.public_linear0:
                SuyonoViewPager.setCurrentItem(SUYONOION_0);
                fotoImg0.setImageResource(R.drawable.number_1_icon);
                fotoImg0.setBackgroundResource(R.drawable.v);
                break;

            case R.id.public_linear1:
                SuyonoViewPager.setCurrentItem(SUYONOION_1);
                fotoImg1.setImageResource(R.drawable.number_2_icon);
                fotoImg1.setBackgroundResource(R.drawable.v);
                break;

            case R.id.public_linear2:
                SuyonoViewPager.setCurrentItem(SUYONOION_2);
                fotoImg2.setImageResource(R.drawable.number_3_icon);
                fotoImg2.setBackgroundResource(R.drawable.v);
                break;

            case R.id.public_linear3:
                SuyonoViewPager.setCurrentItem(SUYONOION_3);
                fotoImg3.setImageResource(R.drawable.number_4_icon);
                fotoImg3.setBackgroundResource(R.drawable.v);
                break;
            case R.id.public_linear4:
                SuyonoViewPager.setCurrentItem(SUYONOION_4);
                fotoImg4.setImageResource(R.drawable.number_5_icon);
                fotoImg4.setBackgroundResource(R.drawable.v);
                break;
        }

    }
    private void getClickEvent() {
        linearLayout0.setOnClickListener(this);
        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);



        SuyonoViewPager.setOnPageChangeListener(new OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                setImg();
                switch (arg0) {
                    case SUYONOION_0:
                        fotoImg0.setImageResource(R.drawable.number_1_icon);
                        fotoImg0.setBackgroundResource(R.drawable.v);
                        break;
                    case SUYONOION_1:
                        fotoImg1.setImageResource(R.drawable.number_2_icon);
                        fotoImg1.setBackgroundResource(R.drawable.v);
                        break;
                    case SUYONOION_2:
                        fotoImg2.setImageResource(R.drawable.number_3_icon);
                        fotoImg2.setBackgroundResource(R.drawable.v);
                        break;
                    case SUYONOION_3:
                        fotoImg3.setImageResource(R.drawable.number_4_icon);
                        fotoImg3.setBackgroundResource(R.drawable.v);
                        break;
                    case SUYONOION_4:
                        fotoImg4.setImageResource(R.drawable.number_5_icon);
                        fotoImg4.setBackgroundResource(R.drawable.v);
                        break;

                }
            }



            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

    }

    private void setImg() {
        fotoImg0.setImageResource(R.drawable.number_1_icon_deselected);
        fotoImg0.setBackgroundResource(R.drawable.vbening);
        fotoImg1.setImageResource(R.drawable.number_2_icon_deselected);
        fotoImg1.setBackgroundResource(R.drawable.vbening);
        fotoImg2.setImageResource(R.drawable.number_3_icon_deselected);
        fotoImg2.setBackgroundResource(R.drawable.vbening);
        fotoImg3.setImageResource(R.drawable.number_4_icon_deselected);
        fotoImg3.setBackgroundResource(R.drawable.vbening);
        fotoImg4.setImageResource(R.drawable.number_5_icon_deselected);
        fotoImg4.setBackgroundResource(R.drawable.vbening);

    }



}