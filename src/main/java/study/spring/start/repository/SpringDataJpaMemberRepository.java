package study.spring.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.spring.start.domain.Member;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

}
