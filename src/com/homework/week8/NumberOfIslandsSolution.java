package com.homework.week8;

import java.util.Arrays;

/**
 * 算法实现：并查集 - 岛屿数量
 * - https://leetcode-cn.com/problems/number-of-islands/ (200题)
 * <p>
 * - (之前的做法：连通块系列问题-图中可以用BFS或者DFS划分连通块)
 *
 * <p>
 * - 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * - 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * - 此外，你可以假设该网格的四条边均被水包围。
 * <p>
 * - 输入：grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * 输出：1
 * <p>
 * - 输入：grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * 输出：3
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] 的值为 '0' 或 '1''
 * <p>
 *
 * @author bruce.zhu@GeekTrainingCamp
 * @since 2022-03-07 08:12:32
 */
public class NumberOfIslandsSolution {
    public static void main(String[] args) {
        NumberOfIslandsSolution solution = new NumberOfIslandsSolution();

        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        System.out.println("Input grid : " + Arrays.deepToString(grid));
        System.out.println("Number of islands with BFS : " + solution.numIslands(grid));

        grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.println("Input grid : " + Arrays.deepToString(grid));
        System.out.println("Number of islands with BFS: " + solution.numIslands(grid));
    }

    int numIslands(final char[][] grid) {
        return 0;
    }
}
