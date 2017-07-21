package cn.linghaiweiye.data.datastore.cloud.request.param;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Description :
 * <p>
 * Created by Chris Kyle on 2016/6/20.
 */
public final class OptionalParam implements Serializable {

    private static final long serialVersionUID = -1709890337329159315L;

    private HashMap<String, String> params = new HashMap<>();

    public OptionalParam() {
    }

    public OptionalParam(String inKey, String inValue) {
        params.put(inKey, inValue);
    }

    public OptionalParam(Map<String, String> input) {
        copyFrom(input);
    }

    public OptionalParam put(String inKey, Object inValue) {
        params.put(inKey, inValue.toString());
        return this;
    }

    public Object get(String inKey) {
        return params.get(inKey);
    }

    public OptionalParam copyTo(Map<String, String> output) {
        if (output == null) {
            return this;
        }
        output.putAll(params);
        return this;
    }

    public OptionalParam copyFrom(Map<String, String> input) {
        if (input == null) {
            return this;
        }
        params.putAll(input);
        return this;
    }

    public OptionalParam copyFrom(OptionalParam optionalParam) {
        if (optionalParam == null) {
            return this;
        }
        return copyFrom(optionalParam.getMap());
    }

    public Map<String, String> getMap() {
        Map<String, String> copy = new HashMap<>();
        copy.putAll(params);
        return copy;
    }

    @Override
    public OptionalParam clone() {
        return new OptionalParam(getMap());
    }
}
