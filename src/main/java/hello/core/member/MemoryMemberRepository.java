package hello.core.member;

/**
 * db가 어디에 저장될지 정하지 못해서 컴퓨터 메모리를 사용해서 테스트하기 위해 '메모리'에 회원저장소 구현하기
 */
public class MemoryMemberRepository implements MemberRepository{


  @Override
  public void save(Member member) {

  }

  @Override
  public Member findById(Long memberId) {
    return null;
  }
}
