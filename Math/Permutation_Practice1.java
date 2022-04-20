package Math;

// 1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순서 O, 중복 x)의 각 결과를 출력하시오
// 방법 1   swap

public class Permutation_Practice1 {
    void permutation(int[] arr, int depth, int n, int r) {
        //재귀 함수, 탈출 조건이 있어야함
        if(depth == r){
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i); // 자리 바꿈
            permutation(arr, depth +1, n, r);
            swap(arr, depth, i); // 복구
        }
    }

    void swap(int[] arr, int depth, int idx){ // depth 몇번째 자리수 인지, idx 어디랑 위치를 바꿀것인지
        int tmp = arr[depth]; // tmp가 ,배열의 한 자리수를 가지고 있고
        arr[depth] = arr[idx]; // 그 자리에 바꿀 자리 데이터를 넣음
        arr[idx] = tmp; // 바뀐 자리에 원래 있던 데이터 넣음
    }

    public static void main(String[] args) {
        //      Test code
        int[] arr = {1, 2, 3, 4};
        Permutation_Practice1 p = new Permutation_Practice1();
        p.permutation(arr, 0, 4, 3);

    }
}
