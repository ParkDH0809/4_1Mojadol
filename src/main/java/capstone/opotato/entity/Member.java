package capstone.opotato.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Setter
@Table(name="member_table")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name="user_id")
    private String userid;
    @NotNull
    private String password;
    @NotNull
    private String name;
    @NotNull
    private String phone;
    @NotNull
    private String address;
    @NotNull
    private String email;
    @NotNull
    @Column(name="camera_id")
    private int cameraid;

}
