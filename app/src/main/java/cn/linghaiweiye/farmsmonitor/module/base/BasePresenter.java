package cn.linghaiweiye.farmsmonitor.module.base;


import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by leixingguo on 2017/1/20.
 */

public abstract class BasePresenter<V extends MvpView> implements Presenter<V> {
    protected V mView;
    protected CompositeDisposable mCompositeDisposable;

    @Override
    public void attachView(V mvpView) {
        this.mView = mvpView;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void start() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void destroyView() {
        mCompositeDisposable.clear();
        mView = null;
    }
}
