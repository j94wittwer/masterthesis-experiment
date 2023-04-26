package IncorrectConditionalLogicTask;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateDiscountTest {

    @Test
    public void calculateDiscount_Age50_IsLoyaltyMember_shouldReturn20percent() {
        CalculateDiscount calculateDiscount = new CalculateDiscount();
        Customer customer = new Customer(true, 50);

        assertEquals(calculateDiscount.calculateDiscount(List.of(1, 3, 4, 3, 6), customer), 0.2);

    }

}
