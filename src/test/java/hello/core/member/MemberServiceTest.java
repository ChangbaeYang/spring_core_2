package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    // Junit을 이용한다.
    @Test
    void join(){
        // given - 새로운 값이 주어지고
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when - 해당 객체와 비교할 값이 주어졌을 때
        // test - 회원 가입, 조회
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertEquals(member, findMember);
    }


}
