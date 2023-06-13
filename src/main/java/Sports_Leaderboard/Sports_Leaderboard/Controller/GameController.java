package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game;
import Sports_Leaderboard.Sports_Leaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController{

    @Autowired
    GameService gameService;
    @GetMapping(value = "getAll")
    public List<Game> getAllGame() {
        return gameService.getAllGame();
    }

}
