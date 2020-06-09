package com.tw;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Goods {
    private Integer quality;
    private Integer sellIn;

    public void updateQuality() {
        quality--;
    }

    public void updateSellIn() {
        sellIn--;
    }
}
