package com.tw;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Goods implements BaseGoods {
    private Integer quality;
    private Integer sellIn;

    @Override
    public void updateQuality() {
        if (quality <= 0) {
            return;
        }
        if (sellIn < 0) {
            quality /= 2;
            return;
        }
        quality--;
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
