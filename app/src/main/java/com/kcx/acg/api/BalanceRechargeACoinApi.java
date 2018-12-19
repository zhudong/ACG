package com.kcx.acg.api;

import com.kcx.acg.base.BaseApi;
import com.kcx.acg.base.SysApplication;
import com.kcx.acg.conf.Constants;
import com.kcx.acg.https.HttpService;
import com.kcx.acg.impl.HttpOnNextListener;
import com.kcx.acg.utils.SPUtil;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by jb on 2018/9/27.
 */
public class BalanceRechargeACoinApi extends BaseApi {
    private int rechargeSettingID;

    public int getRechargeSettingID() {
        return rechargeSettingID;
    }

    public void setRechargeSettingID(int rechargeSettingID) {
        this.rechargeSettingID = rechargeSettingID;
    }


    public BalanceRechargeACoinApi(RxAppCompatActivity rxAppCompatActivity, HttpOnNextListener listener) {
        super(rxAppCompatActivity, listener);
        setShowProgress(false);
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpService httpService = retrofit.create(HttpService.class);
        return httpService.balanceRechargeACoin(getRechargeSettingID());
    }
}
