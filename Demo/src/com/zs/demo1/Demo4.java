package com.zs.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author zhangS
 * @date 2017年8月30日下午1:38:09
 * @Email 260262911@qq.com
 * 括号的配对问题
 * 1。描述：
 * 		现在有一行括号需要 检查括号的 是否匹配
 * 2.第一行输入一个N，表示有N个测试数据，后面的N行输入多组测试 数据。
 * 每组数据都是字符串的长度，数据中只保证是“[”,"]"和"(",")" 就可以了
 * 3.输出  每组输入的数据占一行 如果匹配的 就直接输出是true 否则就是false；
 * 
 */
public class Demo4 {
	public static void main(String[] args) {
		System.out.print("输入要进行测试的数量N=");
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		System.out.println("\n");
		for (int i = 0; i < N; i++) {
			System.out.println("现在输入要测试的数据：");
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
