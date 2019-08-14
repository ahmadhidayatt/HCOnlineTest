package com.example.isengiseng.iseng.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "table_user")
public class User {
    @Id
    @Column(name = "user_id", unique = true, length = 100
    )
    private String id;
    @Column(name = "user_name", length = 100
    )
    private String name;
    @Column(name = "address", length = 100
    )
    private String address;
    @JoinColumn(name = "user"
    )
    @ManyToOne
    private Role role;



}
