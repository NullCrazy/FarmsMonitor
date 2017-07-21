package cn.linghaiweiye.farmsmonitor.di.components;

import android.app.Activity;
import android.content.Context;

import javax.inject.Singleton;

import cn.linghaiweiye.data.RxBus;
import cn.linghaiweiye.data.datastore.cloud.net.ApiConnector;
import cn.linghaiweiye.farmsmonitor.di.modules.ApplicationModule;
import dagger.Component;

/**
 * Created by leixingguo on 2017/1/12.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(Activity activity);

    Context getContext();

    ApiConnector getApiConnector();

    RxBus getRxBus();
}
