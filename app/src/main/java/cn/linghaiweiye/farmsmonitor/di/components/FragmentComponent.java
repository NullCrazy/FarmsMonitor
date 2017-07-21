package cn.linghaiweiye.farmsmonitor.di.components;

import android.app.Activity;

import cn.linghaiweiye.farmsmonitor.di.FragmentScope;
import cn.linghaiweiye.farmsmonitor.di.modules.FragmentModule;
import dagger.Component;

/**
 * Created by leixingguo on 2017/3/6.
 */

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
}
