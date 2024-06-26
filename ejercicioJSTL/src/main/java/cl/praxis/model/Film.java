package cl.praxis.model;

public class Film {
	//Atributos
	private int id;
	private String title;
	private String description;
	private int releaseYear;
	
	//Constructor Vacio
	
	public Film() {
		super();
	}
	
	//constructor completo
	
	public Film(int id, String title, String description, int releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
	}
	
	//Metodos
	
	
	
	
	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
	

	
}
