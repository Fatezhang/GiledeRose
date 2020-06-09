package com.tw;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void shouldNotUpdateQualityWhenQualityLessOrEqualThanZero() {
        var goods = Goods.builder().quality(0).build();

        goods.updateQuality();
        var newQuality = goods.getQuality();

        assertThat(newQuality).isEqualTo(0);
    }

    @Test
    public void shouldDecreaseOneWhenSellInGreaterOrEqualThanZero() {
        var goods = Goods.builder().quality(50).sellIn(10).build();

        goods.updateQuality();
        var newQuality = goods.getQuality();

        assertThat(newQuality).isEqualTo(49);
    }

    @Test
    public void shouldDoubleSlideWhenSellInLessThanZero() {
        var goods = Goods.builder().quality(25).sellIn(-1).build();

        goods.updateQuality();
        var newQuality = goods.getQuality();

        assertThat(newQuality).isEqualTo(12);
    }
}
