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
}
