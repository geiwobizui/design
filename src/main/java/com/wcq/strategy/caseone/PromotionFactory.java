package com.wcq.strategy.caseone;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {
    private static Map<String,PromotionWay> promotionWayMap = new HashMap<>();
    private static String DEFAULT_PROMOTION=PromotionName.WAYA;
    private PromotionFactory(){}
    static{
        promotionWayMap.put(PromotionName.WAYA,new PromotionWayA());
        promotionWayMap.put(PromotionName.WAYB,new PromotionWayB());
        promotionWayMap.put(PromotionName.WAYC,new PromotionWayC());
    }

    public static PromotionWay getPromotionWay(String pWay){
        PromotionWay promotionWay = promotionWayMap.get(pWay);
        return promotionWay==null?promotionWayMap.get(DEFAULT_PROMOTION):promotionWay;
    }

    private interface PromotionName{
        String WAYA = "WAYA";
        String WAYB = "WAYB";
        String WAYC = "WAYC";
    }
}
