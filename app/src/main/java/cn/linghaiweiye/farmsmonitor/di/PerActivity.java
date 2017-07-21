package cn.linghaiweiye.farmsmonitor.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Description :
 * <p/>
 * Created by Chris Kyle on 2016/4/20.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
