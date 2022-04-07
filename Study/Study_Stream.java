package Study;

/*  스트림(Stream)
    - 배열, 컬렉션 등의 데이터를 하나씩 참조하여 처리 가능한 기능
    - for문의 사용을 줄여 코드를 간결하게 만듬
    - stream은 크게 3가지로 구성
        - Stream 생성
        - 중개 연산
        - 최종 연산
    ex) 데이터소스객체.Stream생성().중개연산().최종연산();

    스트림 생성
    - 배열 스트림
        String[] arr = new String[]{"a","b","c"};
        Stream stream = Arrays.stream(arr);
    - 컬렉션 스트림
        ArrayList list = new ArrayList(Arrays.asList(1,2,3));
        Stream stream = list.stream();

    스트림 중개 연산
    - Filtering
        filter 내부 조건에 참인 요소들을 추
        IntStream intStream = IntStream.range(1,10).filter(n -> n % 2 == 0); 1~10까지 짝수만
    - Mapping
        map 안의 연산을 요소별로 수행
        IntStream intStream = IntStream.range(1,10).map(n -> n+1); 1~10까지 데이터를 2 ~ 10

    스트림 최종 연산
    - Sum, Average
        IntStream.range(1,5).sum()
        IntStream.range(1,5).average().getAsDouble()
    - min, max
        IntStream.range(1,5).min().getAsInt()
        IntStream.range(1,5).max().getAsInt()
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Study_Stream {
    public static void main(String[] args) {
        //      1. 스트림 생성

//      1-1. 배열 스트림
        System.out.println("== 배열 스트림 == ");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("== fori ==");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("== forEach ==");
        for (String item: arr) {
            System.out.println(item);
        }

        System.out.println("== to Stream ==");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

//      1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);

        Stream stream2 = list1.stream();
//        stream2.forEach(System.out::println); 스트림은 최종연산을 만나면(forEach) 더이상 Stream 연산을 하지 않고 종료된다.
        stream2.forEach(num -> System.out.println("num = " + num));


//      1-3. 스트림 builder
        System.out.println("== 스트림 builder ==");
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build();
        streamBuilder.forEach(System.out::println);


//      1-4. 스트림 generate
        System.out.println("== 스트림 generate ==");
        Stream streamGenerate = Stream.generate(() -> "abc" ).limit(3); // abc 3번 반복하여 출력
        streamGenerate.forEach(System.out::println);


//      1-5. 스트림 iterate
        System.out.println("== 스트림 iterate ==");
        Stream streamIterate = Stream.iterate(10, n -> n *2).limit(3); // 10 20 40 출력
        streamIterate.forEach(System.out::println);


//      1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림 ==");
        IntStream intStream = IntStream.range(1,5); // 1 2 3 4 출력,  rangeClosed 사용하면 1~5까지 가능
        intStream.forEach(System.out::println);


//      2. 스트림 중개 연산

//      2-1. Filtering
        System.out.println("== Filtering ==");
        IntStream intStream1 = IntStream.range(1,10).filter(n -> n % 2 ==0); //조건에 맞는 값 (2~8 출력)
        intStream1.forEach(System.out::println);

//      2-2. Mapping
        System.out.println("== Mapping ==");
        IntStream intStream2 = IntStream.range(0,10).map(n -> n +1); // 0~9까지의 값을 map안의 연산처리 (1~10 출력)
        intStream2.forEach(n -> System.out.print(n + " "));
        System.out.println();


//      2-3. Sorting
        System.out.println("== Sorting ==");
        IntStream intStream3 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();
        IntStream intStreamSort = intStream3.sorted(); //정렬
        intStreamSort.forEach(System.out::println); // 1 ~ 5 정렬되어 출력


//      3. 최종 연산

//      3-1. Sum, Average
        System.out.println("== sum, average ==");
        int sum = IntStream.range(1,5).sum();
        System.out.println("sum = " + sum);
        double average = IntStream.range(1,5).average().getAsDouble();
        System.out.println("average = " + average);

//      3-2. Min, Max
        System.out.println("== min, max ==");
        int min = IntStream.range(1,5).min().getAsInt();
        System.out.println("min = " + min);
        int max = IntStream.range(1,5).max().getAsInt();
//        IntStream intStream4 = IntStream.builder().add(5).add(6).add(7).build();
//        int max = intStream4.max().getAsInt();
        System.out.println("max = " + max);


//      3-3. reduce
        System.out.println("== reduce ==");
        Stream<Integer> stream3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)).stream();
        System.out.println(stream3.reduce((x, y) -> x + y).get()); // 1+2 = 3+3 = 6+4 = 10+5 = 15출력
        // 연쇄적으로 합을 해서 데이터를 뽑아낼 때 사용


//      3-4. forEach
        System.out.println("== forEach == ");
        IntStream.range(1,10).filter(n -> n == 5).forEach(System.out::println);


    }
}
