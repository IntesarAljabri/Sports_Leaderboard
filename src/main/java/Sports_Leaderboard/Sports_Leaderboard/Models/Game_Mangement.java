package Sports_Leaderboard.Sports_Leaderboard.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "Game_Mangement")
public class Game_Mangement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String GameName;
    String GameInformation;
    String Price;
}
