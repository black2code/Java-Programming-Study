package Math;

/*  데크(Deque)
    - 양쪽에서 삽입 삭제가 모두 가능한 자료구조
    - Deque = Doubly-ended Queue
    - Stack과 Queue를 합친 형태

    add(offer)                    add(offer)
        Rear                Front
    remove(poll)                  remove(poll)

    입력제한 데크(Scroll)
    - 한 쪽의 입력을 제한한 데크 (Rear or Front 쪽 입력 한쪽 제한)

    출력제한 데크(Shelf)
    - 한 쪽의 출력을 제한한 데크 (Rear or Front 쪽 출력 한쪽 제한)


 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Math_Deque {
    public static void main(String[] args) {

        Deque deque = new ArrayDeque();
        // Front 부분 입력
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);

        // Rear 부분 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque);


        // Front 부분 출력
        System.out.println(deque.removeFirst());
        System.out.println(deque);


        // Rear 부분 출력
        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.pollLast());  // null
        System.out.println(deque.removeLast()); // 예외 발생, 예외처리 필요
    }
}
