package entidad;

import java.util.ArrayList;

public class Director extends Empleado implements Despedible {

	// --- Atributos ---

	private ArrayList<Empleado> listaEmpleadosDirector;
	private double incentivo = this.calcularIncentivos();
	private double salarioTotal = this.getSueldoBase() + incentivo;

	// --- Constructores ---

	public Director() {
		super();
	}

	// --- Getters & Setters ---

	public ArrayList<Empleado> getListaEmpleadosDirector() {
		return listaEmpleadosDirector;
	}

	public void setListaEmpleadosDirector(ArrayList<Empleado> listaEmpleadosDirector) {
		this.listaEmpleadosDirector = listaEmpleadosDirector;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	// --- Métodos ---

	@Override
	public String toString() {
		return "Director [listaEmpleadosDirector=" + listaEmpleadosDirector + ", incentivo=" + incentivo
				+ ", salarioTotal=" + salarioTotal + ", getId()=" + getId() + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getSueldoBase()=" + getSueldoBase() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	private double calcularIncentivos() {
		double incentivo = 0;
		for (Empleado e : listaEmpleadosDirector) {
			incentivo += 100;
		}
		return incentivo;
	}

	@Override
	public double calcularDespidoProcedente() {
		return this.getSalarioTotal();
	}

	@Override
	public double calcularDespidoImprocedente(int aniosTrabajados) {
		return this.getSalarioTotal() + (this.getSalarioTotal() * 0.20) * aniosTrabajados;
	}

}
