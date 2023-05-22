package Sports_Leaderboard.Sports_Leaderboard.Controller;
import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PlayerController {
    private PlayerRepository playerRepository;

    public void RegistrationController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping("/players")
    public ResponseEntity<Player> registerPlayer(@RequestBody Player player) {
        Player savedPlayer = playerRepository.save(player);
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

