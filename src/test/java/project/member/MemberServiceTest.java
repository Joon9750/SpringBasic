package project.member;

import project.AppConfig;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MemberServiceTest {
    
    MemberService memberService;
    
    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    
    @Test
    void join() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);
        // Member member2 = new Member(2L, "member2", Grade.VIP);
        
        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        
        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}