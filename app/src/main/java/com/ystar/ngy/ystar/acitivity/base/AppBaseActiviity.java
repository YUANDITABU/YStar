package com.ystar.ngy.ystar.acitivity.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

public abstract class AppBaseActiviity extends BaseAcitivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
            setContentView(LayoutRes());


             initView();
    }

        public  abstract  void initView();

    public abstract @LayoutRes  int LayoutRes();

}
