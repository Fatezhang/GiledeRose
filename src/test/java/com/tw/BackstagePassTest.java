package com.tw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {
    @Test
    public void shouldUpdateQualitySuccessfully() {
        var backstagePass = BackstagePass.builder().quality(50).build();
        var oldQuality = backstagePass.getQuality();

        backstagePass.updateQuality();
        var newQuality = backstagePass.getQuality();

        assertThat(newQuality).isNotEqualTo(oldQuality);
    }

    @Test
    public void shouldUpdateSellInSuccessfully() {
        var backstagePass = BackstagePass.builder().sellIn(10).build();
        var oldQuality = backstagePass.getSellIn();

        backstagePass.updateSellIn();
        var newSellIn = backstagePass.getSellIn();

        assertThat(newSellIn).isNotEqualTo(oldQuality);
    }
}
