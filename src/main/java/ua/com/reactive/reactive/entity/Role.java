package ua.com.reactive.reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.data.relational.core.mapping.Column;

import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "roles")
public class Role {
//public class Role implements GrantedAuthority {

    @Id
    private Long id;
    private String name;

    public Role(String name) {
        this.name = name;
    }

//    private Set<RolesHasUsers> rolesHasUsersList = new HashSet<>();

//    @Override
//    public String getAuthority() {
//        return name;
//    }

}
