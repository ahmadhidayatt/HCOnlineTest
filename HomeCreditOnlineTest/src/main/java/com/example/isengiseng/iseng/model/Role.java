package com.example.isengiseng.iseng.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "table_role")
public class Role {


    @Id
    @Column(name = "role_id", unique = true, length = 100)
    private String id;
    @Column(name = "role_index", length = 100)
    private String role_index;
    @Column(name = "role_val", length = 100)
    private String role_val;
    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<User> user;

}
