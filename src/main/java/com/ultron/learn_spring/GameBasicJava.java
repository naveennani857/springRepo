package com.ultron.learn_spring;

import com.ultron.learn_spring.game.GameConsole;
import com.ultron.learn_spring.game.GameRunner;
import com.ultron.learn_spring.game.MarioGame;
import com.ultron.learn_spring.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameBasicJava {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class)){
			context.getBean(GameConsole.class).up();

			context.getBean(GameRunner.class).run();


		}


//		var marioGame = new SuperContraGame();
//		var gameRunner = new GameRunner(marioGame);
//		gameRunner.run();
	}

}
