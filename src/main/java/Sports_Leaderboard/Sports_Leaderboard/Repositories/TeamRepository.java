package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
