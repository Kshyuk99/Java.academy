package com.company.day012_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda005_api {
	public static void main(String[] args) {
		//#1. Consumer<T>   받는용도 - accept
		// void java.util.function.Consumer.accept ( T t )
		// ()->{}
		//Consumer<String> consumer =(t)->{System.out.println("Hello" + t);};
		Consumer<String> consumer =t->System.out.println("Hello " + t);	
		consumer.accept("sally");
		consumer.accept("alpha");
		
		//#2. Supplier<T> 제공용도 - get
		// T java.util.function.Supplier.get ()
		//Supplier<String> supplier = ()->{return "Hi";};
		Supplier<String> supplier = ()-> "Hi";
		System.out.println(supplier.get() );
		
		//#3. Predicate<T>  판단용도 - test(true/false)
		//boolean java.util.function.Predicate.test ( T t )
		Predicate<Integer> predicate = (Integer i)->{ return i<0; };
		System.out.println(predicate.test(-1));
		System.out.println(predicate.test(1));
		//					Integer i = -1, Integer i = 1 (Wrapper class : 값을 부품객체-클래스)
		
		
		//#4. Function<T>   처리용도 - apply
		// R java.util.function.Function.apply ( T t )
		//Function<String, Integer> function = (String str)->{return Integer.parseInt(str);};
		//Function<String, Integer> function = str->Integer.parseInt(str);
		Function<String, Integer> function = Integer::parseInt;
		System.out.println(function.apply("10") + 3);
		
		//#5. Operator<T>   연산용도 - apply
		// int java.util.function.IntBinaryOperator.applyAsInt ( int left,  int right )
		//																	조건?  참 : 거짓
		//IntBinaryOperator operator = (int left,  int right)->{ return left>=right? left:right; };
		IntBinaryOperator operator = (left,  right)-> left>=right? left:right;
		System.out.println(operator.applyAsInt(10, 3));
	}

}
/******
1. Consumer<T>   받는용도 - accept
2. Supplier<T>   제공용도 - get
3. Predicate<T>  판단용도 - test(true/false)
4. Function<T>   처리용도 - apply
5. Operator<T>   연산용도 - apply
******/