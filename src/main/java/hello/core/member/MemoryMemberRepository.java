package hello.core.member;

import java.util.HashMap;
import java.util.Map;

/**
 * db가 어디에 저장될지 정하지 못해서 컴퓨터 메모리를 사용해서 테스트하기 위해 '메모리'에 회원저장소 구현하기
 */
public class MemoryMemberRepository implements MemberRepository{

  private static Map<Long, Member> store = new HashMap<>();
  //동시에 입력되는 동시성을 생각하면 'Concurrent'HashMap을 사용하는 게 더 좋다

  @Override
  public void save(Member member) {
    store.put(member.getId(), member);

  }

  @Override
  public Member findById(Long memberId) {
    return store.get(memberId);
  }
}
