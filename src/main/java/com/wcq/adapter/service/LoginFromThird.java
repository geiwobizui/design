package com.wcq.adapter.service;

public interface LoginFromThird {
    ResultMsg loginFromQQ(String QQId);
    ResultMsg loginFromWeChart(String WeChartId);
}
