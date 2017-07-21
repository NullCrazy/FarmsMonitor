package cn.linghaiweiye.data.datastore.cloud.respone;

import cn.linghaiweiye.data.datastore.cloud.net.NetworkConfig;
import cn.linghaiweiye.data.exception.BusinessException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Description :
 * <p/>
 * Created by Chris Kyle on 2016/6/20.
 */
public final class ResponseFlatResult {

    public static <T> Observable<T> flatResult(final BaseResponse<T> result) {
        return Observable.create(new ObservableOnSubscribe<T>() {
            @Override
            public void subscribe(ObservableEmitter<T> subscriber) throws Exception {
                switch (result.getStatus()) {
                    case NetworkConfig.SUCCESS_CODE:
                        subscriber.onNext(result.getResult());
                        break;
                    case NetworkConfig.ERROR_CODE:
                        subscriber.onError(new BusinessException(result.getMessage()));
                        break;
                    default:
                        subscriber.onError(new BusinessException(result.getMessage()));
                        break;
                }
                subscriber.onComplete();
            }
        });
    }
}
