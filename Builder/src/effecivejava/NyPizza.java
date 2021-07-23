package effecivejava;

import java.util.Objects;

public class NyPizza extends Pizza{

	public enum Size { SMALL, MEDIUM, LARGE};
	private final Size size;
	
	public static class Builder extends Pizza.Builder {
			private final Size size;
			
			public Builder(Size size) {
				this.size = Objects.requireNonNull(size);
			}
			
			public NyPizza build() {
				return new NyPizza(this);
			}
			
			protected Builder self() {return this;}
	}
	
	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
}
