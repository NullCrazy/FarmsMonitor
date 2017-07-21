package cn.linghaiweiye.data.datastore.cloud.request.param;

/**
 * Created by leixingguo on 2017/3/29.
 */

public class AccountParamProvider extends SimpleParamProvider {

    public AccountParamProvider() {
    }

    public AccountParamProvider userName(String pName) {
        append(ParamConstants.P_NAME, pName);
        return this;
    }

    public AccountParamProvider userPass(String pass) {
        append(ParamConstants.P_PWD, pass);
        return this;
    }

    public AccountParamProvider driverId(String driverId) {
        append(ParamConstants.P_DRIVER_ID, driverId);
        return this;
    }

    public AccountParamProvider newPass(String newPass) {
        append(ParamConstants.P_NEWPWD, newPass);
        return this;
    }
}
