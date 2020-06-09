package com.tw;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoodsTest {

    @Test
    public void shouldUpdateQualitySuccessfully() {
        var goods = Goods.builder().quality(50).build();
        var oldQuality = goods.getQuality();

        var newQuality = goods.updateQuality();

        assertThat(newQuality).isNotEqualTo(oldQuality);
    }
}
