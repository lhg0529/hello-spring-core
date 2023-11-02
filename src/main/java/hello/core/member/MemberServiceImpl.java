package hello.core.member;

public class MemberServiceImpl implements MemberService{

  private final MemberRepository memberRepository = new MemoryMemberRepository();
//memberRepository로 만들어서 만들면 나중에 메모리멤버리포토리 부분을 갈아 끼우기만 하면 됨
  @Override
  public void join(Member member) {
    memberRepository.save(member);
  }

  @Override
  public Member findMember(Long memberId) {
    return memberRepository.findById(memberId);
  }
}

