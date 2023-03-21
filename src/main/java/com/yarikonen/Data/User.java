package com.yarikonen.Data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter
@Entity
@Table(name="trainers")
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "user_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true,nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

}
