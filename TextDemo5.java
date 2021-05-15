import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TextDemo5
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/14 16:41
 */
public class TextDemo5 {

    //计算字符串的距离
//    public static int calStringDistance(String s1,String s2) {
//        int m = s1.length(),n = s2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        //初始化列
//        for(int i = 0; i <= n; i++) {
//            dp[0][i] = i;
//        }
//        //初始化行
//        for(int i = 0; i <= m; i++) {
//            dp[i][0] = i;
//        }
//        for(int i = 1; i <= m; i++) {
//            for(int j = 1; j <= n; j++) {
//                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1];
//                } else {
//                    dp[i][j] = Math.min(Math.min(dp[i - 1][j],dp[i][j - 1]),dp[i - 1][j - 1]) + 1;
//                }
//            }
//        }
//        return dp[m][n];
//    }

    //年终奖
//    public int getMost(int[][] board) {
//        // write code here
//        int[][] dp = new int[6][6];
//        dp[0][0] = board[0][0];
//        for(int i = 1; i < 6; i++) {
//            dp[i][0] = dp[i - 1][0] + board[i][0];
//        }
//        for(int i = 1; i < 6; i++) {
//            dp[0][i] = dp[0][i - 1] + board[0][i];
//        }
//
//        for(int i = 1; i < 6; i++) {
//            for(int j = 1; j < 6; j++) {
//                dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]) + board[i][j];
//            }
//        }
//        return dp[5][5];
//    }

//    public static void dfs(int[][] arr, List<List<Integer>> res, List<Integer> list, int x, int y, int a, int b) {
////        if((x == a - 1) || (y == b - 1)) return;
//        for (int i = x; i < a; i++) {
//            for(int j = y; j < b; j++) {
//                if(arr[i][j] == 0) {
//                    list.add(i);
//                    list.add(j);
//                    res.add(new ArrayList<Integer>(list));
//                    return;
//                }
//                dfs(arr,res,list,x + 1,j,a,b);
//                dfs(arr,res,list,i,y + 1,a,b);
//            }
//        }
////        if(arr[i][j] == 0) {
////            list.add(i);
////            list.add(j);
////            res.add(new ArrayList<Integer>(list));
////            return;
////        }
//
//    }


    //面试题 08.01. 三步问题
//    public int waysToStep(int n) {
//        if(n <= 2) return n;
//        if(n == 4) return 4;
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 4;
//        for(int i = 4; i <= n; i++) {
//            dp[i] = (dp[i - 3] + (dp[i - 2] + dp[i - 1]) % 1000000007) % 1000000007;
//        }
//        return dp[n];
//    }


    //剑指 Offer 18. 删除链表的节点
//    public ListNode deleteNode(ListNode head, int val) {
//        if(head == null) return null;
//        if(head.val == val) {
//            head = head.next;
//            return head;
//        }
//        ListNode cur = head;
//        while(cur.next != null) {
//            if(cur.next.val == val) {
//                cur.next = cur.next.next;
//                break;
//            }
//            cur = cur.next;
//        }
//        return head;
//    }
    public static void main(String[] args) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        int[][] arr = new int[][]{{0,1,0,0,0},{0,1,0,1,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,1,0}};
//        dfs(arr,res,list,0,0,5,5);
//        System.out.println(res);
    }
}
