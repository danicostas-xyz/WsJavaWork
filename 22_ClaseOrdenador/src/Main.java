import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Setting CPU Data
		Cpu cpu = new Cpu();
		cpu.setManufacturer("Intel");
		cpu.setModel("i7 12700KF");
		cpu.setNumberOfCores(12);
		cpu.setPrice(320.99);

		// Setting Graphic Card Data
		GraphicCard graphicCard = new GraphicCard();
		graphicCard.setManufacturer("Nvidia");
		graphicCard.setModel("RTX 3060Ti");
		graphicCard.setCUDACores(4352);
		graphicCard.setPrice(350.99);
		graphicCard.setRam(new Ram("Samsung", 8, 95));

		// Setting Motherboard Data
		MotherBoard motherBoard = new MotherBoard();
		motherBoard.setManufacturer("MSI");
		motherBoard.setPrice(210);
		motherBoard.setFormFactor("ATX");

		// Setting RAM1 Data
		Ram ramStick1 = new Ram();
		ramStick1.setManufacturer("Corsair");
		ramStick1.setSize(16);
		ramStick1.setPrice(47.99);

		// Setting RAM2 Data
		Ram ramStick2 = new Ram();
		ramStick2.setManufacturer("Corsair");
		ramStick2.setSize(16);
		ramStick2.setPrice(47.99);

		// Setting RAM3 Data
		Ram ramStick3 = new Ram();
		ramStick3.setManufacturer("Corsair");
		ramStick3.setSize(16);
		ramStick3.setPrice(47.99);

		// Setting RAM4 Data
		Ram ramStick4 = new Ram();
		ramStick4.setManufacturer("Corsair");
		ramStick4.setSize(16);
		ramStick4.setPrice(47.99);

		// Setting Ram List w/ data from the modules of Ram
		ArrayList<Ram> ramList = new ArrayList<Ram>();
		ramList.add(ramStick1);
		ramList.add(ramStick2);
		ramList.add(ramStick3);
		ramList.add(ramStick4);

		// Setting Mouse Data
		Peripheral mouse = new Peripheral();
		mouse.setType("Mouse");
		mouse.setManufacturer("Razer");
		mouse.setPrice(84.99);

		// Setting Screen Data
		Peripheral screen = new Peripheral();
		screen.setType("Screen");
		screen.setManufacturer("LG");
		screen.setPrice(462.81);

		// Setting Keyboard Data
		Peripheral keyboard = new Peripheral();
		keyboard.setType("Keyboard");
		keyboard.setManufacturer("Logitech");
		keyboard.setPrice(93);

		// Setting Peripheral List w/ data from mouse, screen & keyboard
		ArrayList<Peripheral> peripheralList = new ArrayList<Peripheral>();
		peripheralList.add(mouse);
		peripheralList.add(screen);
		peripheralList.add(keyboard);

		// Setting Computer Data w/ all the components previously created
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setGraphicCard(graphicCard);
		computer.setMotherBoard(motherBoard);
		computer.setRamList(ramList);
		computer.setPeripheralList(peripheralList);

		// Print computer (w/ all components) data, first w/out Total Price, which is
		// defined as 0
		System.out.println(computer);

		// Calling computer.totalComputerPrice to set the total price of the computer
		computer.totalComputerPrice();
		System.out.println("----");

		// Printing again computer, now with this.price = this.totalComputerPrice
		System.out.println(computer);

	}

}
