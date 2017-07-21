package cn.linghaiweiye.farmsmonitor.di.modules;

import android.app.Activity;
import android.support.v4.app.Fragment;

import cn.linghaiweiye.farmsmonitor.di.FragmentScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by leixingguo on 2017/3/6.
 */

@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @FragmentScope
    public Activity provideActivity() {
        return fragment.getActivity();
    }
}
