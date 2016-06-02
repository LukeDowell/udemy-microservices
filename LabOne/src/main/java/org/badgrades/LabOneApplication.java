package org.badgrades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class LabOneApplication implements CommandLineRunner{

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(LabOneApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		List<Team> list = new ArrayList<>();
		Set<Player> players = new HashSet<>();
		players.add(new Player("Bob", "Left"));
		players.add(new Player("Jon", "Right"));

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		team.setPlayers(players);
		list.add(team);

		players = new HashSet<>();
		players.add(new Player("Ana", "Up"));
		players.add(new Player("Banana", "Down"));

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		team.setPlayers(players);
		list.add(team);

		teamRepository.save(list);
	}
}
