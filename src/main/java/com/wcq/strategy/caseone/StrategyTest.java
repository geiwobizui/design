package com.wcq.strategy.caseone;

import com.wcq.strategy.caseone.PromotionActivity;
import com.wcq.strategy.caseone.PromotionFactory;

public class StrategyTest {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = new PromotionActivity(new PromotionWayA());
//        promotionActivity.execute();
//    }

    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(PromotionFactory.getPromotionWay("WAYB"));
        promotionActivity.execute();
    }
}
