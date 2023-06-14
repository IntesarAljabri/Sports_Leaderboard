package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game;
import Sports_Leaderboard.Sports_Leaderboard.Request.GameRequest;
import Sports_Leaderboard.Sports_Leaderboard.Response.GameResponse;
import Sports_Leaderboard.Sports_Leaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController{

    @Autowired
    GameService gameService;
    @RequestMapping(value = "getAllGames", method = RequestMethod.GET)
    public List<Game> getAllGame() {
        return gameService.getAllGame();
    }

    @GetMapping(value = "getGameById")
    public Game  getGameById(@RequestParam Integer id) {
        Game gameById = gameService.getGameByIdById(id);
        return gameById;
    }
    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public void createGameA(@RequestBody GameRequest gameRequest) {
        gameService.createGameA(gameRequest);
    }

    @RequestMapping(value = "getAllActiveGames", method = RequestMethod.GET)
    public List<GameResponse> getAllActiveGames() {
        List<Game> listOfGames = gameService.getAllActiveGames();
        List<GameResponse> gameResponseList = Collections.singletonList(GameResponse.convertRequestToResponse((Game) listOfGames));
        return gameResponseList;
    }

    @RequestMapping(value = "getAllInActiveGames", method = RequestMethod.GET)
    public List<GameResponse> getAllInActiveGames() {
        List<Game> listOfGames = gameService.getAllInActiveGames();
        List<GameResponse> gameResponse = Collections.singletonList(GameResponse.convertRequestToResponse((Game) listOfGames));
        return gameResponse;
    }

    @RequestMapping(value = "deleteAllGame", method = RequestMethod.POST)
    public void deleteAllGame() {
        gameService.deleteAllGames();
    }

    public ResponseEntity<Game> updateGame (@PathVariable Long id, @RequestBody Game updaeGame) {
        Game game = gameService.updateGame(id);
        if (game != null) {
            return ResponseEntity.ok(game);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
