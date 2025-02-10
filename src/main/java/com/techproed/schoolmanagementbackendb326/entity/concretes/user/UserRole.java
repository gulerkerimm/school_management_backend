package com.techproed.schoolmanagementbackendb326.entity.concretes.user;

import com.techproed.schoolmanagementbackendb326.entity.enums.RoleType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    private String roleName;

}
