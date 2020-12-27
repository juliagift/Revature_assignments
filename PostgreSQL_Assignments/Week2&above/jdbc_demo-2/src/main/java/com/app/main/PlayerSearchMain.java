package com.app.main;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchMain {

	public static void main(String[] args) {
		PlayerSearchDAO dao = new PlayerSearchDAOImpl();
		
		try {
			Player player = dao.getPlayerByContact("1263548901");
			if (player != null) {
				System.out.println("Details of player with Contact " +player.getContact());
				System.out.println(player);
			}
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());;
		}
		
		try {
			List<Player> playersList = dao.getPlayersByGender("F");
			if (playersList != null && playersList.size() != 0) {
				System.out.println("\n\nFound " +playersList.size() +" no. of players in the DB... Printing them all");
				for (Player p : playersList) {
					System.out.println(p);
				}
			}
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

	} 

}
 