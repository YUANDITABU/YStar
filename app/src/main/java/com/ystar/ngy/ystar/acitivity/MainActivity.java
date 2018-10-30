package com.ystar.ngy.ystar.acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.ystar.ngy.ystar.R;
import com.ystar.ngy.ystar.acitivity.base.AppBaseActiviity;
import com.ystar.ngy.ystar.acitivity.base.BaseAcitivity;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseAcitivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {

    }

    @Override
    public int LayoutRes() {
        return R.layout.activity_main;
    }
}

