package com.homework.week3;

import com.teachingpractice.week3.graph.RedundantConnectionSolution;

/**
 * 算法实现：冗余连接II
 * - 相关链接：冗余连接
 * <p>
 * - 在本问题中，有根树指满足以下条件的 有向 图。该树只有一个根节点，所有其他节点都是该根节点的后继。该树除了根节点之外的每一个节点都有且只有一个父节点，而根节点没有父节点。
 * <p>
 * - 输入一个有向图，该图由一个有着 n 个节点（节点值不重复，从 1 到 n）的树及一条附加的有向边构成。附加的边包含在 1 到 n 中的两个不同顶点间，这条附加的边不属于树中已存在的边。
 * <p>
 * - 结果图是一个以边组成的二维数组 edges 。 每个元素是一对 [ui, vi]，用以表示 有向 图中连接顶点 ui 和顶点 vi 的边，其中 ui 是 vi 的一个父节点。
 * <p>
 * - 返回一条能删除的边，使得剩下的图是有 n 个节点的有根树。若有多个答案，返回最后出现在给定二维数组的答案。
 * <p>
 * - 输入：edges = [[1,2],[1,3],[2,3]]
 * 输出：[2,3]
 * <p>
 * - 输入：edges = [[1,2],[2,3],[3,4],[4,1],[1,5]]
 * 输出：[4,1]
 * <p>
 * n == edges.length
 * 3 <= n <= 1000
 * edges[i].length == 2
 * 1 <= ui, vi <= n
 *
 * @author bruce.zhu@GeekTrainingCamp
 * @see RedundantConnectionSolution
 * @since 2022-01-20 06:26:40
 */
public class RedundantDirectedConnectionSolution {
    public static void main(String[] args) {

    }

    private static int[] findRedundantDirectedConnection(final int[][] edges) {
        return new int[]{};
    }
}