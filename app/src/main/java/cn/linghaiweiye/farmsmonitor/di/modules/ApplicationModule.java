package cn.linghaiweiye.farmsmonitor.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import cn.linghaiweiye.farmsmonitor.module.App;
import dagger.Module;
import dagger.Provides;

/**
 * Created by leixingguo on 2017/1/12.
 */
@Module
public class ApplicationModule {
    private App application;

    public ApplicationModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }
}
