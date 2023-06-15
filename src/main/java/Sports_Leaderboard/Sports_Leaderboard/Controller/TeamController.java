package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.TeamRepository;
import Sports_Leaderboard.Sports_Leaderboard.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeamController {
  @Autowired
    TeamService teamService;

    @GetMapping(value = "getTeamById")
    public Team getTeamById(@RequestParam Integer id) {
        Team teamById = teamService.getTeamById(id);
        return teamById;
    }
    @RequestMapping(value = "RegisterNewTeam", method = RequestMethod.POST)    //Register Player
    public void registerNewTeam() {
        teamService.createTeam();
    }



}

