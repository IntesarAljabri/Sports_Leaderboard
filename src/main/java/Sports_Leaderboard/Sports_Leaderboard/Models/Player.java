package Sports_Leaderboard.Sports_Leaderboard.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Table(name = "Player")
public class Player extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    String SportType;
    String Location;
    String email;
}
