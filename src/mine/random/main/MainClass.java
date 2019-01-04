package mine.random.main;

import mine.random.logic.WordMachineStack;

public class MainClass {

	public static void main(String[] args) {
		WordMachineStack machineStack = new WordMachineStack();
		System.out.println(machineStack.doTask("POP 12 POP 12 DUP + 34 -"));
	}

}
