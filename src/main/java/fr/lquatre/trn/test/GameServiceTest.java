package fr.lquatre.trn.test;

import fr.lquatre.trn.model.Game;
import fr.lquatre.trn.model.R6Game;
import fr.lquatre.trn.repository.InMemoryRepository;
import fr.lquatre.trn.service.GameService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class
GameServiceTest {
    @Test
    public void testAddAndFindGame() {
        InMemoryRepository repository = new InMemoryRepository();
        GameService gameService = new GameService(repository);
        Game game = new R6Game();

        gameService.addGame(game);
        Game retrievedGame = gameService.getGame("Rainbow Six Siege");

        assertNotNull(retrievedGame);
        assertEquals("Rainbow Six Siege", retrievedGame.getName());
    }
}