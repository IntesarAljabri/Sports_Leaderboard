package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Request.LeaderBoardRequest;
import Sports_Leaderboard.Sports_Leaderboard.Service.LeaderBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<LeaderBoard> getLeaderBoardOrderByWinners() {
        return leaderBoardService.getLeaderBoardOrderByWinners();
    }

    @GetMapping(value = "getAllLeaderBoard")
    public List<LeaderBoard> getAllLeaderboards() {
        return leaderBoardService.getAllLeaderBoards();
    }

    @GetMapping(value = "getLeaderBoardById")
    public LeaderBoard getLeaderBoardById(@RequestParam Integer id) {
        LeaderBoard leaderBoardById = leaderBoardService.getLeaderBoardById(id);
        return leaderBoardById;
    }

    @PostMapping(value = "addLeaderBoards")
    public String LeaderBoards(@RequestBody LeaderBoard leaderBoard) {
        leaderBoardService.addLeaderBoards(leaderBoard);
        return "LeaderBoard added";
    }
}
