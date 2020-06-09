package com.tw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    public void shouldUpdateSellInSuccessfully() {
        var backstagePass = BackstagePass.builder().sellIn(10).build();
        var oldQuality = backstagePass.getSellIn();

        backstagePass.updateSellIn();
        var newSellIn = backstagePass.getSellIn();

        assertThat(newSellIn).isNotEqualTo(oldQuality);
    }

    @Test
    public void shouldNotIncreaseWhenQualityGreaterOrEqualThan50() {
        var backstagePass = BackstagePass.builder().quality(50).build();

        backstagePass.updateQuality();
        var newQuality = backstagePass.getQuality();

        assertThat(newQuality).isEqualTo(50);
    }

    @Test
    public void shouldIncrease2WhenSellInLessThan10AndGreaterThan5() {
        var backstagePass = BackstagePass.builder().quality(10).sellIn(8).build();

        backstagePass.updateQuality();
        var newQuality = backstagePass.getQuality();

        assertThat(newQuality).isEqualTo(12);
    }

    @Test
    public void shouldIncrease3WhenSellInLessThan5AndGreaterThan0() {
        var backstagePass = BackstagePass.builder().quality(3).sellIn(2).build();

        backstagePass.updateQuality();
        var newQuality = backstagePass.getQuality();

        assertThat(newQuality).isEqualTo(6);
    }

    @Test
    public void shouldChangeTo0WhenSellInLessThan0() {
        var backstagePass = BackstagePass.builder().quality(30).sellIn(0).build();

        backstagePass.updateQuality();
        var newQuality = backstagePass.getQuality();

        assertThat(newQuality).isEqualTo(0);
    }
}
