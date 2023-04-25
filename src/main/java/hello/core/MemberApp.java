package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        // MemberService 구현체의 객체를 하나 생성한다.
        MemberService memberService = new MemberServiceImpl();
        // 새로운 멤버객체를 생성한다.
        Member member = new Member(1L, "memberA", Grade.VIP);
        // memberService 객체를 부르고, member를 가입시킨다.
        memberService.join(member);

        // member객체를 id를 토앻서 찾는다.
        Member findMember = memberService.findMember(1L);
        // 아래의 두 객체는 같은 것이 뜨게된다.
        System.out.println("newMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
