package com.tw;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BackstagePass {
    private Integer quality;
    private Integer sellIn;

    public void updateQuality() {
        if (quality >= 50) {
            return;
        }
        if (sellIn <= 10 && sellIn > 5) {
            quality += 2;
        }
        if (sellIn<=5 && sellIn > 0) {
            quality += 3;
        }
        if (sellIn<=0) {
            quality=0;
        }
    }

    public void updateSellIn() {
        sellIn--;
    }
}
