package com.example.toonight.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "user")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String password;

    @CreationTimestamp
    private Date regdate;

    @UpdateTimestamp
    private Data updatedate;

    @Builder
    public MemberEntity(String email,String name, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
