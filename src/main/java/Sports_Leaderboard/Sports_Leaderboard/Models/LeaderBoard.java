package Sports_Leaderboard.Sports_Leaderboard.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Setter
@Getter
@Entity
@Table(name = "LeaderBoard")
public class LeaderBoard {
}
