package com.ystar.ngy.ystar.acitivity.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.ystar.ngy.ystar.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseAcitivity extends AppCompatActivity {

    protected Activity mActivity;
    Toolbar toolBar;
    RelativeLayout contentLayout;
    RelativeLayout mRootLayout;
    public Unbinder unbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base_acitivity);
        initviewBaseView();
        setContentView(LayoutRes());
        unbinder = ButterKnife.bind(this, mRootLayout);
        //
        initView();

    }
    private  void  initviewBaseView(){
        mActivity = this;
        mRootLayout=findViewById(R.id.rootlayout);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder!=null)
            unbinder.unbind();
    }

    @Override
    public void setContentView(int layoutResID) {
        View view = LayoutInflater.from(mActivity).inflate(layoutResID, mRootLayout, false);
        setContentView(view);
    }

    @Override
    public void setContentView(View view) {
        mRootLayout.addView(view);
    }
    public  abstract  void initView();
    public abstract @LayoutRes  int LayoutRes();


}
