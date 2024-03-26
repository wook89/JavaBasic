package hw0325;

import java.util.Scanner;

public class Hw0325ex10 {

	public static void main(String[] args) {
		System.out.println("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num)) {
			System.out.println(num + " 는 소수입니다.");
		} else {
			System.out.println(num + " 는 소수가 아닙니다.");
		}
	}
	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0 || n == 1) {
				return false;
			}
		}
		if (n == 1 || n <= 0) {
			return false;
		}
		return true;
	}
}
