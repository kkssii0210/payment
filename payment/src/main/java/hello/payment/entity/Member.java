package hello.payment.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(schema = "PAYMENT")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String address;
    @Builder
    public Member(String username,String email,String address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }
}
