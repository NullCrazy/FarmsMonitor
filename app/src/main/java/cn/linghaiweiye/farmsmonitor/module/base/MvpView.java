package cn.linghaiweiye.farmsmonitor.module.base;

import android.content.Context;

/**
 * Created by leixingguo on 2017/1/20.
 */

public interface MvpView {
    Context context();

    void showTip(String message);
}
