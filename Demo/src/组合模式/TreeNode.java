package 组合模式;

import java.util.ArrayList;
import java.util.Iterator;

/**
* @author zhangS
* @date 2017年9月29日下午3:26:31
* @Email 260262911@qq.com
*/
public class TreeNode {

	private String name;
	private TreeNode parent;
	private ArrayList<TreeNode> children=new ArrayList<TreeNode>();
	
	public TreeNode(String name) {
		this.name=name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void add(TreeNode node){
		children.add(node);
	}
	public void remove(TreeNode node){
		children.remove(node);
	}
	public Iterator<TreeNode> getChildren(){
		
		return children.iterator();
	}
}
