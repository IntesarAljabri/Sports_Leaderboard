package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {
    @Query(value = "SELECT le FROM LeaderBoard la where le.id= :id")
    LeaderBoard getLeaderBoardById(@Param("id") Integer id);
    @Query(value = "SELECT le FROM LeaderBoard le order by le.teamWins desc")
    List<LeaderBoard> getLeaderBoardOrderByWinners();

}
