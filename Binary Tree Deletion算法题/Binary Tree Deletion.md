2022/10/6 12:29 Binary Tree Deletion | CS 253-2 (Fall 2022) Question | Contests | HackerRank
https://www.hackerrank.com/contests/cs-253-2-fall-2022/challenges/binary-tree-deletion-2-1 1/4
PRACTICE CERTIFICATION COMPETE
CAREER
FAIR
NEW
 Search  
jliu738

The email address you signed up with has not been verified. You won't be ranked on the leaderboard until you verify your
account.
SEND AGAIN 
All Contests  CS 253-2 (Fall 2022)  Binary Tree Deletion
Binary Tree Deletion
Problem Submissions Leaderboard Discussions
Given a root of a binary tree, delete all subtrees whose elements are all even numbers, and return the modified tree. A subtree of a
node is the node itself plus all its children.
The following picture is an illustration of the three samples shown below.
Sample One:
Sample Two:
Sample Three:

2022/10/6 12:29 Binary Tree Deletion | CS 253-2 (Fall 2022) Question | Contests | HackerRank
https://www.hackerrank.com/contests/cs-253-2-fall-2022/challenges/binary-tree-deletion-2-1 2/4
Input Format
The input includes two lines. The first line has a single integer: N The second line has N integers or nulls: A[0] A[1] ... A[N-1] The array
A stores the input binary tree values by level.
Constraints
1 ≤ N ≤ 500 For each i, 0 ≤ A[i] < 100
Output Format
Output a single line with integers or nulls separated by spaces. The output integers or nulls show the values of the output binary
tree by level.
Sample Input 0
9
3 4 5 10 3 null 4 null 6
Sample Output 0
3 4 5 null 3
Sample Input 1
7
4 3 6 null 1 8 8
Sample Output 1
4 3 null null 1
Sample Input 2
7
2 4 6 null null 8 10
Sample Output 2
null
Contest ends in 2 months
Submissions: 24
Max Score: 8
  
2022/10/6 12:29 Binary Tree Deletion | CS 253-2 (Fall 2022) Question | Contests | HackerRank
https://www.hackerrank.com/contests/cs-253-2-fall-2022/challenges/binary-tree-deletion-2-1 3/4
Difficulty: Medium
Rate This Challenge:
More
    
 ⚙ Java 8 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
       }
     }
 
 // FILL ME IN!
    public static TreeNode deleteTree(TreeNode root) {
        return null;
   }
 public static void main(String[] args) throws IOException {
        // Read input array A. We avoid java.util.Scanner, for speed.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // first line
        Integer[] A = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine()); // second line
        for (int i=0; i<N; ++i) {
            String s = st.nextToken();
            A[i] = (s.equals("null") ? null : Integer.parseInt(s));
       }
        
        // Create the input binary tree
        TreeNode root = new TreeNode();
        if (A[0] == null) {
            root = null;
       }
        else {
            int count = 0;
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            root = new TreeNode(A[0]);
            q.add(root);
            TreeNode cur = null;
            for(int i = 1; i < A.length; i++){
                TreeNode node = new TreeNode();
                if (A[i] == null) {
                    node = null;
               } else {
                    node = new TreeNode(A[i]);
               }
                if(count == 0){
                   cur = q.poll();          
               }
                if(count==0){
                  count++;
                  cur.left = node;
               }else {
                  count = 0;
1▾
2
3
4
5
6
7▾
8▾
9
10
11
12
13▾
14▾
15
16
17
18
19
20
21
22
23▾
24
25
26
27▾
28
29
30
31▾
32
33▾
34
35▾
36
37
38
39
40▾
41
42
43▾
44
45
46▾
47
48
49▾
50
51▾
52
53▾
54▾
55
56▾
57
58
59▾
60
61
62▾
63
2022/10/6 12:29 Binary Tree Deletion | CS 253-2 (Fall 2022) Question | Contests | HackerRank
https://www.hackerrank.com/contests/cs-253-2-fall-2022/challenges/binary-tree-deletion-2-1 4/4
Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |
Test against custom input
Line: 1 Col: 1
Run Code Submit Code  Upload Code as File
                  cur.right = node;
               }
                if(A[i] != null){
                  q.add(node);
               }
             }
       }
        // Solve the problem!
        root = deleteTree(root);
        // Print the output binary tree, again buffered for speed.
        PrintWriter out = new PrintWriter(System.out);
        
        Queue<TreeNode> curr=new LinkedList<TreeNode>();
        Queue<TreeNode> next=new LinkedList<TreeNode>();
        
        if (root == null) out.print("null ");
        else {
            curr.add(root);
            next.add(root.left);
            next.add(root.right);
            out.print(root.val + " ");
            boolean end = false;
            while (!next.isEmpty()) {
                curr = next;
                next = new LinkedList<TreeNode>();
                while (!curr.isEmpty()) {
                    TreeNode temp = curr.poll();
                    if (temp == null) {
                        end = true;
                        for (TreeNode t : curr) {
                            if (t != null) {
                                end = false;
                                break;
                           }
                       }
                        if (end == true) {
                            for (TreeNode t : next) {
                                if (t != null) {
                                    end = false;
                                    break;
                               }
                           }
                       }
                        if (end == true) break;
                        out.print("null ");
                   } else {
                        out.print(temp.val + " ");
                        next.add(temp.left);
                        next.add(temp.right);
                   }
               }
                if (end == true) break;
           }
       }    
        out.close();
   }
}
64
65
66▾
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82▾
83
84
85
86
87
88▾
89
90
91▾
92
93▾
94
95▾
96▾
97
98
99
100
101▾
102▾
103▾
104
105
106
107
108
109
110
111▾
112
113
114
115
116
117
118
119
120
121
122