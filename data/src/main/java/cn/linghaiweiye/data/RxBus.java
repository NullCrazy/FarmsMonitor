package cn.linghaiweiye.data;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

/**
 * Description :
 * <p>
 * Created by Chris Kyle on 2016/5/5.
 */
@Singleton
public final class RxBus {

    private final Subject mSubject;

    @Inject
    public RxBus() {
        mSubject = PublishSubject.create().toSerialized();
    }

    public void post(Object o) {
        mSubject.onNext(o);
    }

    public <T> Observable<T> toObservable(Class<T> eventType) {
        return mSubject.ofType(eventType);
    }
}
