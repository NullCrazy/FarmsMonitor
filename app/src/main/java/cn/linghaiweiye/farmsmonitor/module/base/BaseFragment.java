package cn.linghaiweiye.farmsmonitor.module.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import cn.linghaiweiye.farmsmonitor.di.components.DaggerFragmentComponent;
import cn.linghaiweiye.farmsmonitor.di.components.FragmentComponent;
import cn.linghaiweiye.farmsmonitor.di.modules.FragmentModule;

import static cn.linghaiweiye.farmsmonitor.module.App.getAppComponent;

/**
 * Created by leixingguo on 2017/1/20.
 */

public abstract class BaseFragment extends Fragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeInjector();
    }

    protected FragmentComponent getFragmentComponent() {
        return DaggerFragmentComponent.builder()
                .applicationComponent(getAppComponent())
                .fragmentModule(getFragmentModule())
                .build();
    }

    protected FragmentModule getFragmentModule() {
        return new FragmentModule(this);
    }

    protected abstract void initializeInjector();

    protected void showTip(Context context, String msg) {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
