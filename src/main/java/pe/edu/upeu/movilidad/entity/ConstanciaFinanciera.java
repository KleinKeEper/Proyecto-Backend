package pe.edu.upeu.movilidad.entity;

public class ConstanciaFinanciera {
	private int id_constancia_financiera;
	private String doc_financiero;
	private int id_plan;
	private int id_docente;
	public ConstanciaFinanciera() {
		super();
	}
	public ConstanciaFinanciera(int id_constancia_financiera, String doc_financiero, int id_plan, int id_docente) {
		super();
		this.id_constancia_financiera = id_constancia_financiera;
		this.doc_financiero = doc_financiero;
		this.id_plan = id_plan;
		this.id_docente = id_docente;
	}
	public int getId_constancia_financiera() {
		return id_constancia_financiera;
	}
	public void setId_constancia_financiera(int id_constancia_financiera) {
		this.id_constancia_financiera = id_constancia_financiera;
	}
	public String getDoc_financiero() {
		return doc_financiero;
	}
	public void setDoc_financiero(String doc_financiero) {
		this.doc_financiero = doc_financiero;
	}
	public int getId_plan() {
		return id_plan;
	}
	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}
	public int getId_docente() {
		return id_docente;
	}
	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}
	
	
}
