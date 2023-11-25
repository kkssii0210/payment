package hello.payment.service;

import hello.payment.entity.Member;
import hello.payment.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @Override
    public Member autoRegister() {
        Member member = Member.builder()
                .username(UUID.randomUUID().toString())
                .email("example@example.com")
                .address("서울특별시 영등포구 문래동")
                .build();
        return memberRepository.save(member);
    }
}
