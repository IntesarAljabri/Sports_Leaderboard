package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game;

import Sports_Leaderboard.Sports_Leaderboard.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    static
    GameRepository gameRepository;

    public static List<Game> getAllGame() {return gameRepository.findAll();}
}
