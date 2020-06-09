package com.tw;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Goods {
    private Integer quality;
    private Integer sellIn;

    public void updateQuality() {
        if (quality <=0) {
            return;
        }
        quality--;
    }

    public void updateSellIn() {
        sellIn--;
    }
}
