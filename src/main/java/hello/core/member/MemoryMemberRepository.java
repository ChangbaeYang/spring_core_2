package hello.core.member;

import java.util.Map;
import java.util.HashMap;

public class MemoryMemberRepository implements MemberRepository {

    // 해쉬맵은 원래 콘쿼런트 해쉬맵을 쓰는 게 맞다.
    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
