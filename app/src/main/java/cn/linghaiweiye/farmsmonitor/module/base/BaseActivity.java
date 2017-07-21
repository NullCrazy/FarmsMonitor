package cn.linghaiweiye.farmsmonitor.module.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import cn.linghaiweiye.farmsmonitor.di.components.ActivityComponent;
import cn.linghaiweiye.farmsmonitor.di.components.DaggerActivityComponent;
import cn.linghaiweiye.farmsmonitor.di.modules.ActivityModule;

import static cn.linghaiweiye.farmsmonitor.module.App.getAppComponent;

/**
 * Created by leixingguo on 2017/1/12.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeInjector();
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .applicationComponent(getAppComponent())
                .activityModule(getActivityModule())
                .build();
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //MobclickAgent.onPause(this);
    }

    protected abstract void initializeInjector();

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected void showTip(Context context, String msg) {
    }
}
