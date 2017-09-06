package com.zs.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author zhangS
 * @date 2017��8��30������1:38:09
 * @Email 260262911@qq.com
 * ���ŵ��������
 * 1��������
 * 		������һ��������Ҫ ������ŵ� �Ƿ�ƥ��
 * 2.��һ������һ��N����ʾ��N���������ݣ������N������������ ���ݡ�
 * ÿ�����ݶ����ַ����ĳ��ȣ�������ֻ��֤�ǡ�[��,"]"��"(",")" �Ϳ�����
 * 3.���  ÿ�����������ռһ�� ���ƥ��� ��ֱ�������true �������false��
 * 
 */
public class Demo4 {
	public static void main(String[] args) {
		System.out.print("����Ҫ���в��Ե�����N=");
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		System.out.println("\n");
		for (int i = 0; i < N; i++) {
			System.out.println("��������Ҫ���Ե����ݣ�");
			String next = scanner.next();
			if (isMatch(next)) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		List<String> list = list();
	}

	private static <T> List<T> list(){
		
		return new ArrayList<T>();
	}
	private static boolean isMatch(String next) {
		Stack<Character> sk=new Stack<Character>();
		for (int i = 0; i < next.length(); i++) {
			if (next.charAt(i)=='(') {
				sk.push('(');
			}
			if (next.charAt(i)==')') {
				if (!sk.isEmpty()&&sk.pop()=='(') {
					continue;
				}else {
					return false;
				}
			}
			if (next.charAt(i)=='[') {
				sk.push('[');
			}
			if (next.charAt(i)==']') {
				if (!sk.isEmpty()&&sk.pop()=='[') {
					continue;
				}else {
					return false;
				}
			}
		}
		if (sk.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
}
