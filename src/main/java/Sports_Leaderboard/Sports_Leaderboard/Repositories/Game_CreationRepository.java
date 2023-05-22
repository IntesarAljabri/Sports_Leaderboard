package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Creation;
import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Mangement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Game_CreationRepository extends JpaRepository<Game_Creation, Integer> {
}
