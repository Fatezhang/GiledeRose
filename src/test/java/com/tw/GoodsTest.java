package com.tw;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GoodsTest {

    @Test
    public void shouldUpdateQualitySuccessfully() {
        var goods = Goods.builder().quality(50).build();
        var oldQuality = goods.getQuality();

        goods.updateQuality();
        var newQuality = goods.getQuality();

        assertThat(newQuality).isNotEqualTo(oldQuality);
    }

    @Test
    public void shouldUpdateSellInSuccessfully() {
        var goods = Goods.builder().sellIn(10).build();
        var oldQuality = goods.getSellIn();

        goods.updateSellIn();
        var newSellIn = goods.getSellIn();

        assertThat(newSellIn).isNotEqualTo(oldQuality);
    }
}
