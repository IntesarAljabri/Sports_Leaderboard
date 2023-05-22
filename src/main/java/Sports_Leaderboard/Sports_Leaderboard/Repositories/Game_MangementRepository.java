package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Mangement;
import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Game_MangementRepository extends JpaRepository<Game_Mangement, Integer> {
}
