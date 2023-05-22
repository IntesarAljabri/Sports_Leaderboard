package Sports_Leaderboard.Sports_Leaderboard.Models;

import antlr.collections.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "Game_Creation")
public class Game_Creation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    List players;
    Integer score;
    Integer price;

}
