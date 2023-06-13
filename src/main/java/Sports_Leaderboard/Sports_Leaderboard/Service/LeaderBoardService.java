package Sports_Leaderboard.Sports_Leaderboard.Service;


import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.LeaderBoardRepository;
import Sports_Leaderboard.Sports_Leaderboard.Request.LeaderBoardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class LeaderBoardService {

    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    public void createLeaderBoard(LeaderBoardRequest leaderBoardRequest) {
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName(leaderBoardRequest.getTeamName());
        leaderBoard.setTeamWins(leaderBoardRequest.getWins());
        leaderBoard.setTeamLosses(leaderBoardRequest.getLosses());
        leaderBoard.setCreateDate(new Date());
        leaderBoard.setIsActive(true);
        leaderBoardRepository.save(leaderBoard);
    }

    public LeaderBoard getLeaderBoardById(Integer id) {
        LeaderBoard leaderBoardById = leaderBoardRepository.getLeaderBoardById(id);
        return leaderBoardById;
    }
    public List <LeaderBoard> getLeaderBoardOrderByWins(){
        List<LeaderBoard> leaderBoardOrderByWins = leaderBoardRepository.getLeaderBoardOrderByWins();
        return leaderBoardOrderByWins;
    }
}
