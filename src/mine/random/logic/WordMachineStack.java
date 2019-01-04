package mine.random.logic;

import java.util.ArrayList;
import java.util.List;

public class WordMachineStack {

	private List<Integer> stack;

	private void push(Integer integer) {
		if (integer >= 0 && integer <= (Math.pow(20, 20)) - 1) {
			stack.add(integer);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void pop() {
		if (stack.size() > 0) {
			stack.remove(stack.size() - 1);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void duplicate() {
		if (stack.size() > 0) {
			this.push(stack.get(stack.size() - 1));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void add() {
		Integer value;
		if (stack.size() > 1) {
			value = Math.addExact(stack.get(stack.size() - 1), stack.get(stack.size() - 2));
			this.pop();
			this.pop();
			this.push(value);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void subtract() {
		Integer value;
		if (stack.size() > 1) {
			value = Math.subtractExact(stack.get(stack.size() - 1), stack.get(stack.size() - 2));
			this.pop();
			this.pop();
			this.push(value);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public Integer doTask(final String sequence) {
		stack = new ArrayList<Integer>();
		String array[] = sequence.split(" ");
		for (String arr : array) {
			switch (arr) {
			case "POP":
				this.pop();
				break;
			case "DUP":
				this.duplicate();
				break;
			case "+":
				this.add();
				break;
			case "-":
				this.subtract();
				break;

			default:
				if (arr.matches("-?(0|[1-9]\\d*)")) {
					this.push(Integer.valueOf(arr));
					break;
				}
				throw new UnsupportedOperationException();
			}
		}

		return stack.get(stack.size()-1);
	}

	public List<Integer> getStack() {
		return stack;
	}

	public void setStack(List<Integer> stack) {
		this.stack = stack;
	}

}
