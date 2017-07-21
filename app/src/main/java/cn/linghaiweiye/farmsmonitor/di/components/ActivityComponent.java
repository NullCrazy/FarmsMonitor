package cn.linghaiweiye.farmsmonitor.di.components;

import android.app.Activity;

import cn.linghaiweiye.farmsmonitor.di.PerActivity;
import cn.linghaiweiye.farmsmonitor.di.modules.ActivityModule;
import dagger.Component;

/**
 * Created by leixingguo on 2017/1/12.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
