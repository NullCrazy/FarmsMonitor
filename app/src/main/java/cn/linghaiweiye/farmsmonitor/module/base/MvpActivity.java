package cn.linghaiweiye.farmsmonitor.module.base;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity implements MvpView {

    private static final String TAG = MvpActivity.class.getSimpleName();

    @Inject
    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.start();
    }

    @Override
    public void showTip(String message) {
        showTip(this, message);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.pause();
    }

    @Override
    public Context context() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroyView();
    }
}
