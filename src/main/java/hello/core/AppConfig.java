package hello.core;

import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

// 인터페이스가 어떤 구현체로 구현이 될 것인지를 정하는 클래스 -> AppConfig
// 환경 설정
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl();
    }
}
