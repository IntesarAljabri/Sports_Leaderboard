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
@Table(name = "Game")
public class Game extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String description;
    @OneToOne
    @JoinColumn(name = "team1Id", referencedColumnName = "id")
    Team teamOne;
    @OneToOne
    @JoinColumn(name = "team2Id", referencedColumnName = "id")
    Team teamTwo;
    Integer scoreTeamOne;
    Integer scoreTeamTwo;

}
