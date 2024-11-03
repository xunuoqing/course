Truth in the middle
Now a days, we are surrounded by lies all the time. But if we look close enough, we will always find exactly one truth for each matter. In this task, we will try to put that truth in the middle.

Let's say we have a n x n matrix (n > 1 and must be an odd number), consisting of n^2 - 1 false statements and a single true statement. Let's index the matrix rows by numbers from 1 to n from top to bottom, let's index the matrix columns by numbers from 1 to n from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

Swap two neighboring rows, that is, rows with indexes i and i + 1 for some integer i (1 ≤ i < n). 

Swap two neighboring columns, that is, columns with indexes j and j + 1 for some integer j (1 ≤ j < n).

Let's look for the true statement and put it in the middle of the matrix. For example, if n =5, then we need to put the true value in the cell that is on the intersection of the third row and the third column. Your task is to count the minimum number of moves needed to put the true statement in the middle of the matrix.

Input:

Dimension of the matrix, n.

The input consists of n lines, each line contains n characters, either F or T. 

Output:

Print a single integer - the minimum number of moves needed to put the truth in the middle (i.e. the distance between the truth and the middle of the matrix).

n must be greater than 1 and an odd number. If not, return "Invalid size of the matrix"

There must be exactly one T in the matrix. If not, return "Error! Exactly one truth please"




真理在中间
现在，我们无时无刻不被谎言所包围。但是，如果我们看得足够仔细，我们总能准确地发现每个问题的一个真相。在这个任务中，我们将尝试把这个真理放在中间。
假设我们有一个n×n的矩阵（n>1且必须是奇数），由n^2-1个错误的陈述和一个真实的陈述组成。让我们用1到n的数字从上到下索引矩阵的行，让我们用1到n的数字从左到右索引矩阵的列。在一次移动中，你可以对矩阵应用以下两种转换中的一种。
交换两个相邻的行，也就是说，对于某个整数i（1≤i<n），索引为i和i+1的行。
交换两个相邻的列，即索引为j和j+1的列，为某个整数j（1≤j<n）。
我们来寻找真实的语句，并把它放在矩阵的中间。例如，如果n=5，那么我们需要把真值放在第三行和第三列的交汇处的单元格中。你的任务是计算出把真值放在矩阵中间所需的最少移动次数。
输入。
矩阵的尺寸，n。
输入由n行组成，每行包含n个字符，可以是F或T。
输出。
打印一个整数--将真言放在中间所需的最小移动数（即真言与矩阵中间的距离）。
n必须大于1且为奇数。如果不是，则返回 "矩阵的大小无效"
矩阵中必须正好有一个T。如果没有，返回 "错误! 只有一个真值，请注意"




