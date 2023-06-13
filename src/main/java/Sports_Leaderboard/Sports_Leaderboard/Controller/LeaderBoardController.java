package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Request.LeaderBoardRequest;
import Sports_Leaderboard.Sports_Leaderboard.Service.LeaderBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
public class LeaderBoardController<ResponseEntity> {

    @Autowired
    LeaderBoardService leaderBoardService;

    @RequestMapping(value = "createLeaderBoard", method = RequestMethod.POST)
    public void createLeaderBoard(@RequestParam LeaderBoardRequest leaderBoardRequest) {
        leaderBoardService.createLeaderBoard(leaderBoardRequest);
    }
    @RequestMapping(value = "retrieveCurrentStandings", method = RequestMethod.POST)
    public List<LeaderBoard> getLeaderBoardOrderByWins() {
        return leaderBoardService.getLeaderBoardOrderByWins();
    }

    @RequestMapping(value = "getLeaderBoardById", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardById(@RequestParam Integer id) {
        LeaderBoard leaderBoardById = leaderBoardService.getLeaderBoardById(id);
        return leaderBoardById;
    }
}
