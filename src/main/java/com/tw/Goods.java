package com.tw;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Goods {
    private Integer quality;

    public Integer updateQuality() {
        quality--;
        return this.quality;
    }
}
