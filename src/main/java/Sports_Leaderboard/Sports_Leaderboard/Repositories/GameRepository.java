package Sports_Leaderboard.Sports_Leaderboard.Repositories;


import Sports_Leaderboard.Sports_Leaderboard.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
}
