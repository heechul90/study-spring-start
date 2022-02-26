package study.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.start.repository.JdbcMemberRepository;
import study.spring.start.repository.JdbcTemplateMemberRepository;
import study.spring.start.repository.MemberRepository;
import study.spring.start.repository.MemoryMemberRepository;
import study.spring.start.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
