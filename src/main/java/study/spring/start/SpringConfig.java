package study.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.start.repository.MemberRepository;
import study.spring.start.repository.MemoryMemberRepository;
import study.spring.start.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
