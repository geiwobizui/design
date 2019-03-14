package com.wcq.strategy.caseone;

public class PromotionActivity {
    private PromotionWay promotionWay;
    public PromotionActivity(PromotionWay promotionWay){
        this.promotionWay=promotionWay;
    }
    public void execute(){
        promotionWay.executePromotion();
    }
}
