package cn.linghaiweiye.farmsmonitor.module;

import android.app.Application;

import cn.linghaiweiye.farmsmonitor.di.components.ApplicationComponent;
import cn.linghaiweiye.farmsmonitor.di.components.DaggerApplicationComponent;
import cn.linghaiweiye.farmsmonitor.di.modules.ApplicationModule;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/07/20 16:50.
 */

public class App extends Application {
    private static ApplicationComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }


    private void initializeInjector() {
        mAppComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static ApplicationComponent getAppComponent() {
        return mAppComponent;
    }
}
