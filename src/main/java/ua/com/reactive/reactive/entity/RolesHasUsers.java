package ua.com.reactive.reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "rolesHasUsers")
public class RolesHasUsers {

    @Id
    private Long id;
    @Column("role_id")
    private Long role_id;
    @Column("user_id")
    private Long user_id;

    public RolesHasUsers(Long role_id, Long user_id) {
        this.role_id = role_id;
        this.user_id = user_id;
    }

}
