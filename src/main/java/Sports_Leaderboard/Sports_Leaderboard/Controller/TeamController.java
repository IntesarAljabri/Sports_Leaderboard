package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.TeamRepository;
import Sports_Leaderboard.Sports_Leaderboard.Service.PlayerService;
import Sports_Leaderboard.Sports_Leaderboard.Service.TeamService;
import antlr.collections.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeamController {
    @PostMapping("/teams")
    public ResponseEntity<Team> registerTeam(@RequestBody Team team) {
        Team savedTeam = TeamRepository.save(team);
        return new ResponseEntity<>(savedTeam, HttpStatus.CREATED);
    }
}
//    @Autowired
//    TeamService teamService;
//
//    @RequestMapping(value = "getAll", method = RequestMethod.GET)
//    public List<Team> getAllTeam() {
//        return teamService.getAllTeam();
//
//    }

