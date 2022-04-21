package Math;

// 1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순서 X, 중복 x)의 각 결과를 출력하시오

public class Combination_Practice {

    /*  arr = 1, 2, 3, 4
        vi~ = 0, 0, 0, 0
        depth = 0, r = 3

        depth = 1, r = 2    vi~ = 1, 0, 0, 0
        depth = 2, r = 1    vi~ = 1, 1, 0, 0
        depth = 3, r = 0    vi~ = 1, 1, 1, 0

        out = 1, 2, 3
        depth = 3, r = 0 에서 depth = 2로 돌아감
        돌아간 후 depth = 2, vi~ = 1, 1, 1, 0 -> vi~ = 1, 1, 0, 0 으로(false)
        depth 는 3 이되고 r은 그대로 1, 다시 호출 vi~ = 1, 1, 0, 1 으로(true)
        다시 호출하면 depth는 4되고 r은 0 , out = 1,2,4
        돌아가서 depth 3 r은 1  vi~ = 1, 1, 0, 0 (false)

     */


    void combination(int[] arr, boolean[] visited, int depth, int n, int r) {

        if(r == 0){
            for (int i = 0; i < n; i++) {
                if(visited[i]){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        if(depth == n){
            return;
        }

        visited[depth] = true;
        combination(arr, visited, depth + 1, n, r-1);
        //depth = 3, r = 0 에서 depth = 2로 돌아감

        visited[depth] = false;
        // 돌아간 후 depth = 3, vi~ = 1, 1, 1, 0 -> vi~ = 1, 1, 0, 0 으로(false)
        combination(arr, visited, depth + 1, n, r);
        //depth 는 3 이되고 r은 그대로 1
//        System.out.print("depth =  " + depth + "  ");
//        System.out.print("r =" + r + "  ");
    }

    public static void main(String[] args) {
        //      Test code
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = {false, false, false, false};

        Combination_Practice p = new Combination_Practice();
        p.combination(arr, visited, 0, 4, 3);
    }
}
