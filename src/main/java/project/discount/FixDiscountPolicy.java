package project.discount;

import project.member.*;

public class FixDiscountPolicy implements DiscountPolicy {
    
    private int discountFixAmount = 1000; // fixed price
    
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}