package Sports_Leaderboard.Sports_Leaderboard.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Table(name = "Registration")
public class Registration extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer registerId;
    String userName;
    String password;
    String teamName;
    String sportType;
}
