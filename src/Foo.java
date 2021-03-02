import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i+10;
        Function<Integer, Integer> multiple2 = (i) -> i*2;

        Function<Integer, Integer> plus10AndMultiple2 = plus10.compose(multiple2); //compse는 먼저 실행하는 함수
        Function<Integer, Integer> multiple2AndPlus10 = plus10.andThen(multiple2); //andthen은 나중에  실행하는 함수
        System.out.print(plus10AndMultiple2.apply(2)); //14
        System.out.print(multiple2AndPlus10.apply(2)); //24

    }
}
 