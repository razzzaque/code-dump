package mine.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFuntion {

	@FunctionalInterface // annotation not mandatory
	public interface TheInterface {
		void print();

		static void printer() {

		}

		default void printer1() {

		}
	}

	public interface AnotherInterface {
		void print();

		void print1();
	}

	public interface ReturnTypeMethodInterface {
		String print(String value);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		TheInterface i = new TheInterface() {

			@Override
			public void print() {
				System.out.println("SHOWING!!!!");
			}
		};

		TheInterface i1 = () -> System.out.println("SHOWING LAMBDA!!!!");
		ReturnTypeMethodInterface type = value -> value + " SHOWING!!!!";
//		AnotherInterface another = () -> System.out.println("SHOWING LAMBDA!!!!"); // Not functional Interface.Compilation fails!!!
		list.forEach(str -> System.out.println(str));
		i.print();
		i1.print();
		System.out.println(type.print("TROPICAL"));

	}

}
