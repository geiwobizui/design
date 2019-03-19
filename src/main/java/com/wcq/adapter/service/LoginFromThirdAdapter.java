package com.wcq.adapter.service;

public class LoginFromThirdAdapter extends SignServiceImpl implements LoginFromThird {
    @Override
    public ResultMsg loginFromQQ(String QQId) {
        return procesLogin(QQId,LoginFromQQAdapter.class);
    }

    @Override
    public ResultMsg loginFromWeChart(String WeChartId) {
        return procesLogin(WeChartId,LoginFromWeChartAdapter.class);
    }
    //简单工厂+策略
    private ResultMsg procesLogin(String id,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter loginAdapter = clazz.newInstance();
            if (loginAdapter.support(loginAdapter)) {
                return loginAdapter.login(id, loginAdapter);
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
