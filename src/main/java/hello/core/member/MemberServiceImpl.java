package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // 객체를 그냥 선언하는 것과 new를 통해서 생성해놓는 것의 차이??
    // 아래를 보면 추상화에도 의존하고, 구현체에도 의존을 하게 된다. -> DIP 위반
//    private final MemberRepository memberRepository = new MemoryMemberRepository();

    private Mem

    @Override
    public void join(Member member) {
        // 구현체로부터 오는 save함수가 실행되게 된다.(다형성, 오버라이딩-런타임)
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
