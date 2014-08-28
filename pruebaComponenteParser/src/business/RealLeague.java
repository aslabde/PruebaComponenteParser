package business;

import java.util.List;

public class RealLeague {
	
	private List<Team> teams; 
	
	public RealLeague(){};
	
	public RealLeague(List<Team> teams){
		this.teams = teams;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	

	
}
