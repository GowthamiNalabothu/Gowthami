package com.codinghub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config1
{
	@Bean
	public game game1()
	{
		game g=new game();
		g.setName("Virat");
		g.setPlayers(11);
		g.setStadium_name("gsstadium");
		g.setStadium_strength(100);
		return g;
  }	
}
