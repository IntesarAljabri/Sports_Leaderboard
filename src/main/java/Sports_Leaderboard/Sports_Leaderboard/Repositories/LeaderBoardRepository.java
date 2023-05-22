package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {
}
