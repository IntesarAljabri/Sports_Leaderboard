package Sports_Leaderboard.Sports_Leaderboard.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "LeaderBoard")
public class LeaderBoard extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String teamName;
    Integer teamWins;
    Integer teamLosses;


}
