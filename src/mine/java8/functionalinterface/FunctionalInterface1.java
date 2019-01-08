package mine.java8.functionalinterface;

public class FunctionalInterface1 {
	
	@FunctionalInterface
	private interface FuncInterface<T>{
		boolean equals(Object t);

		T show();
	}

	public static void main(String[] args) {
		FuncInterface face1 = new FuncInterface() {
			
			@Override
			public String show() {
				return null;
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean equals(Object t) {
				return false;
				
			}
		};
		FuncInterface face = () -> "SHOWING!!!!!";
		System.out.println(face.show());
	}

}
