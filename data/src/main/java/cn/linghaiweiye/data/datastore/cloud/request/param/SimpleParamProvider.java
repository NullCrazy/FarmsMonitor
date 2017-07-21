package cn.linghaiweiye.data.datastore.cloud.request.param;

/**
 * Description :
 * <p/>
 * Created by Chris Kyle on 2016/6/20.
 */
public class SimpleParamProvider implements ParamProvider {

    protected final OptionalParam mOptionalParam;

    public SimpleParamProvider() {
        mOptionalParam = new OptionalParam();
    }

    public OptionalParam getOptionalParam() {
        return mOptionalParam;
    }

    protected final void append(String key, String value) {
        if (null != key) {
            mOptionalParam.put(key, value);
        }
    }
}
