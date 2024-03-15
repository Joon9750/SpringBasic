package project.discount;

import project.member.Member;

public interface DiscountPolicy {
    
    // return is discount price
    int discount(Member member, int price);
}