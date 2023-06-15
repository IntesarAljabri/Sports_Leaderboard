package Sports_Leaderboard.Sports_Leaderboard.Repositories;


import Sports_Leaderboard.Sports_Leaderboard.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    @Query(value = "UPDATE game ga Set ga.isActive = false")
    void deleteAllGame();
    @Query("SELECT g FROM Game g where g.isActive = 1")
    List<Game> getAllActiveGames();
    @Query("SELECT ga FROM Game ga Where ga = Id ")
    List<Game> getGameById(Long gameId);

}
