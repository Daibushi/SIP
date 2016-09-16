package sip.com;

public class Component {

	
	int id;
	String component_nome;
	String marca;
	String desc;
	

	String tipo;
	String compat[];

	
	public Component(int id, String component_nome, String marca, String desc, String tipo, String[] compat) {
		super();
		this.id = id;
		this.component_nome = component_nome;
		this.marca = marca;
		this.desc = desc;
		this.tipo = tipo;
		this.compat = compat;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComponent_nome() {
		return component_nome;
	}
	public void setComponent_nome(String component_nome) {
		this.component_nome = component_nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String[] getCompat() {
		return compat;
	}
	public void setCompat(String[] compat) {
		this.compat = compat;
	}
}
