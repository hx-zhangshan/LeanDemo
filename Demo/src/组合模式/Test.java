package ���ģʽ;

import java.util.Iterator;

/**
* @author zhangS
* @date 2017��9��29������3:26:47
* @Email 260262911@qq.com
* ���ģʽ;���ģʽ�ֽ��� ���֡�������ģʽ����������ϳɲ�����������ʾ���νṹ��
* ���ģʽ�ڴ������νṹ��ʱ��ȽϷ���
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
