package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

  public static void main(String[] args) {
    MemberService memberService = new MemberServiceImpl();
    Member member = new Member(529L, "Lee", Grade.VIP);
    memberService.join(member);

    Member findMember = memberService.findMember(529L);
    System.out.println("new member = "+ member.getName());
    System.out.println(member.getGrade()+member.getName()+member.getId());
    System.out.println("find member = "+ findMember.getName());
  }
}
