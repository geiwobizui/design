package com.wcq.strategy.casetwo;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    private static Map<Enum,Pay> PAYWAYMAP = new HashMap<>();
    private static final Enum DEFAULT_PAY = PayEnum.ALIPAY;
    static{
        PAYWAYMAP.put(PayEnum.ALIPAY,new AliPay());
        PAYWAYMAP.put(PayEnum.WECHARTPAY,new WeChatPay());
        PAYWAYMAP.put(PayEnum.JDPAY,new JDPay());
    }
    public static Pay getPay(Enum e){
        return PAYWAYMAP.get(e)==null?PAYWAYMAP.get(DEFAULT_PAY):PAYWAYMAP.get(e);
    }
}
