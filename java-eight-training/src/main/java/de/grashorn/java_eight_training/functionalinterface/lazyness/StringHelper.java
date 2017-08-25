package de.grashorn.java_eight_training.functionalinterface.lazyness;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class StringHelper implements IntermittentString {

	List<UnaryOperator<String>> ops = new ArrayList<>();
	private String initial;

	public static StringHelper of(String s) {
		StringHelper helper = new StringHelper();
		helper.initial = s;
		return helper;
	}

	public StringHelper() {
	}

	public StringHelper(String initial) {
		super();
		this.initial = initial;
	}

	@Override
	public IntermittentString transform(UnaryOperator<String> op) {
		ops.add(op);
		return this;
	}

	@Override
	public String toString() {
		String result = initial;
		for (UnaryOperator<String> unaryOperator : ops) {
			result = unaryOperator.apply(result);
		}
		return result;
	}

	public static void main(String[] args) {

		IntermittentString a = new StringHelper("sdfsdf").transform(as -> as.concat("32444444444444444")).transform(String::toUpperCase);
		// IntermittentString im = StringHelper.of("moin moin MOin !!!").transform(String::toLowerCase).transform(st -> st.concat("dsf"));
		
		System.out.println(a);
	}
}
