package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.TeamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeamController {
    private TeamRepository teamRepository;

    public void RegistrationController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @PostMapping("/teams")
    public ResponseEntity<Team> registerTeam(@RequestBody Team team) {
        Team savedTeam = teamRepository.save(team);
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

