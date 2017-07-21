package cn.linghaiweiye.farmsmonitor.di.modules;

import android.app.Activity;

import cn.linghaiweiye.farmsmonitor.di.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by leixingguo on 2017/1/12.
 */

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity activity() {
        return this.mActivity;
    }
}
