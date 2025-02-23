package com.ultron.learn_spring;

import com.ultron.learn_spring.game.GameConsole;
import com.ultron.learn_spring.game.GameRunner;
import com.ultron.learn_spring.game.MarioGame;
import com.ultron.learn_spring.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GameConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game){
        return new GameRunner(game);
    }
}
