package business;


public class Player {
	
	private int id;
	private String name;
	private Team team;
	private Position posicion;
	private long value;
		
	
	public Player(){};	
	
	public Player(int id, String name, Team team, Position posicion, long value) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.posicion = posicion;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Position getPosicion() {
		return posicion;
	}

	public void setPosicion(Position posicion) {
		this.posicion = posicion;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	
}
