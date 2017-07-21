package cn.linghaiweiye.farmsmonitor.module.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;


/**
 * Created by leixingguo on 2017/3/10.
 */

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment implements MvpView {

    private static final String TAG = MvpFragment.class.getSimpleName();

    @Inject
    protected P presenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.attachView(this);
    }

    @Override
    public Context context() {
        return getActivity();
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.start();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.pause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.destroyView();
    }


    @Override
    public void showTip(String message) {
        showTip(getActivity(), message);
    }
}
