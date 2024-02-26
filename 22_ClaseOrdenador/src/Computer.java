import java.util.ArrayList;

public class Computer {
	private double precio;
	private Cpu cpu;
	private GraphicCard graphicCard;
	private MotherBoard motherBoard;
	private Peripheral peripheral;
	private ArrayList<Ram> ramList;
	private ArrayList<Peripheral> peripheralList;
	
	public Computer() {
		super();
	}

	public Computer(double precio, Cpu cpu, GraphicCard graphicCard, MotherBoard motherBoard, Peripheral peripheral,
			ArrayList<Ram> ramList, ArrayList<Peripheral> peripheralList) {
		super();
		this.precio = precio;
		this.cpu = cpu;
		this.graphicCard = graphicCard;
		this.motherBoard = motherBoard;
		this.peripheral = peripheral;
		this.ramList = ramList;
		this.peripheralList = peripheralList;
	}

	@Override
	public String toString() {
		return "Computer [precio=" + precio + ", cpu=" + cpu + ", graphicCard=" + graphicCard + ", motherBoard="
				+ motherBoard + ", peripheral=" + peripheral + ", ramList=" + ramList + ", peripheralList="
				+ peripheralList + "]";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public Peripheral getPeripheral() {
		return peripheral;
	}

	public void setPeripheral(Peripheral peripheral) {
		this.peripheral = peripheral;
	}

	public ArrayList<Ram> getRamList() {
		return ramList;
	}

	public void setRamList(ArrayList<Ram> ramList) {
		this.ramList = ramList;
	}

	public ArrayList<Peripheral> getPeripheralList() {
		return peripheralList;
	}

	public void setPeripheralList(ArrayList<Peripheral> peripheralList) {
		this.peripheralList = peripheralList;
	}
	
	
	
	
}
