package capstone.opotato.repository;

import capstone.opotato.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//extends JpaRepository를 하면 CRUD 작업을 할 수 있도록 알아서 처리해줌
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByUserid(String userid);
}
