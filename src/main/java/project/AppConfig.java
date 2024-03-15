package project;

import project.discount.FixDiscountPolicy;
import project.discount.RateDiscountPolicy;
import project.member.MemberService;
import project.member.MemberServiceImpl;
import project.member.MemoryMemberRepository;
import project.member.MemberRepository;
import project.order.OrderService;
import project.order.OrderServiceImpl;
import project.discount.DiscountPolicy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
    
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    
    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}