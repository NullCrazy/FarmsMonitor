package cn.linghaiweiye.data.datastore.cloud.net;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by leixingguo on 2017/3/6.
 */
@Singleton
public class ApiConnector {
    private Retrofit mRetrofit;

    @Inject
    public ApiConnector(Context context) {
        init(context);
    }

    private void init(Context context) {

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new LoggerInterceptor());
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .connectTimeout(NetworkConfig.REQUEST_TIME_OUT_DURATION, TimeUnit.SECONDS)
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(NetworkConfig.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getApiCreator() {
        return mRetrofit;
    }
}
