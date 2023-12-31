package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

  public static void main(String[] args) {
//    AppConfig appConfig = new AppConfig();
//    MemberService memberService = appConfig.memberService();
//    MemberService memberService = new MemberServiceImpl(memberRepository);

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

    Member member = new Member(529L, "Lee", Grade.VIP);
    memberService.join(member);

    Member findMember = memberService.findMember(529L);
    System.out.println("new member = "+ member.getName());
//    System.out.println(member.getGrade()+member.getName()+member.getId());
    System.out.println("find member = "+ findMember.getName());
  }
}
