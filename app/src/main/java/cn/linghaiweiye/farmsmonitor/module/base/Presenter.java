package cn.linghaiweiye.farmsmonitor.module.base;

/**
 * Created by leixingguo on 2017/1/20.
 */

public interface Presenter<V extends MvpView> {
    void attachView(V v);

    void start();

    void resume();

    void pause();

    void destroyView();
}
