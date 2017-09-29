package 组合模式;

import java.util.Iterator;

/**
* @author zhangS
* @date 2017年9月29日下午3:26:47
* @Email 260262911@qq.com
* 组合模式;组合模式又叫做 部分——整体模式。将对象组合成部分整体来表示树形结构。
* 组合模式在处理树形结构的时候比较方便
*/
public class Test {

	public static void main(String[] args) {
		TreeNode root=new TreeNode("A");
		TreeNode bNode=new TreeNode("B");
		TreeNode cNode=new TreeNode("C");
		TreeNode dNode=new TreeNode("D");
		root.add(bNode);
		root.add(cNode);
		cNode.add(dNode);
		Iterator<TreeNode> children = root.getChildren();
		while(children.hasNext()){
			System.out.println(children.next().getName());
		}
	}
}
