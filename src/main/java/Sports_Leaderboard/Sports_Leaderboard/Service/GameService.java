package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game;

import Sports_Leaderboard.Sports_Leaderboard.Repositories.GameRepository;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.TeamRepository;
import Sports_Leaderboard.Sports_Leaderboard.Request.GameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GameService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    static
    GameRepository gameRepository;

    public static List<Game> getAllGame() {return gameRepository.findAll();}

    // Create new Game
    public void createGameA(GameRequest gameRequest) {
        Game game = (Game) gameRequest.convertToGameRequest((List<GameRequest>) gameRequest);
        gameRepository.save(game);
    }
    //Get game by id
    public Game getGameByIdById(Integer id) {
        Game gameById = (Game) gameRepository;
        return gameById;
    }

    public List<Game> getAllActiveGames() {
        return gameRepository.getAllActiveGames();
    }

    public List<Game> getAllInActiveGames() {
        return gameRepository.getAllInActiveGames();
    }

    public void deleteAllGames() {
        gameRepository.deleteAllGame();
    }

    //update game by getId
    public Game updateGame(Long gameId, GameRequest gameRequest) {
        Game game = (Game) gameRepository.getGameById(gameId);
        game.setDescription(gameRequest.getDescription());
        game.setScoreTeamOne(gameRequest.getScoreTeam1());
        game.setScoreTeamTwo(gameRequest.getScoreTeam2());
        game.setUpdateDate(new Date());
        gameRepository.save(game);
        return game;
    }
}
