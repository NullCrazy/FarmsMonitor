package cn.linghaiweiye.farmsmonitor.di;

/**
 * Description : Interface representing a contract for clients that contains a component for
 * dependency injection.
 * <p/>
 * Created by Chris Kyle on 2016/4/20.
 */
public interface HasComponent<C> {

    C getComponent();
}
