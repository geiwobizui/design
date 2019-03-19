package com.wcq.decorator.service;

public class SignFromThridServiceImpl implements SignFromThridService {
    private SignService service;

    public SignFromThridServiceImpl(SignService service) {
        this.service = service;
    }

    @Override
    public ResultMsg loginFromQQ(String QQId) {
        return null;
    }

    @Override
    public ResultMsg loginFromWeChart(String WeChartId) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return service.register(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return service.login(username, password);
    }
}
