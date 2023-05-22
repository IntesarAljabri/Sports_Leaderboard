package Sports_Leaderboard.Sports_Leaderboard.Controller;
import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.PlayerRepository;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.TeamRepository;
import Sports_Leaderboard.Sports_Leaderboard.Service.PlayerService;
import antlr.collections.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PlayerController {
    @PostMapping("/players")
    public ResponseEntity<Player> registerPlayer(@RequestBody Player player) {
        Player savedPlayer = PlayerRepository.save(player);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }
}

//    @Autowired
//    PlayerService playerService;
//
//    @RequestMapping(value = "getAll", method = RequestMethod.GET)
//    public List<Player> getAllPlayer() {
//        return playerService.getAllPlayer();
//
//    }

