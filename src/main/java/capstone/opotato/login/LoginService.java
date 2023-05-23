package capstone.opotato.login;

import capstone.opotato.entity.Member;
import capstone.opotato.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String loginId, String password) {
        return memberRepository.findByUserid(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
