package com.wcq.decorator.service;

public interface SignFromThridService extends SignService {
    ResultMsg loginFromQQ(String QQId);
    ResultMsg loginFromWeChart(String WeChartId);
}
