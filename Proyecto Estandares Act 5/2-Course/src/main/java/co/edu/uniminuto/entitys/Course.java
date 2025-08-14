package co.edu.uniminuto.entitys;

public class Course implements Cloneable {
	// 1. Declaracion de atributos
	private int id;
	private String name;
	private int duration;
	// 2. Constructores
	public Course() {
		
	}
	public Course(int id, String name, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	public Course(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}
	
	//3. Métodos de acceso get && set
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
			return new Course(this.id, this.name, this.duration);
		}
	}
	// Método toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", duration=");
		builder.append(duration);
		builder.append("]");
		return builder.toString();
	}
	
	
		
	//Método para poder clonar los objetos 
	
	
	
	
	
	
	

}
