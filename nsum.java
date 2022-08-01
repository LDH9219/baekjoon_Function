/*
 * 15596
 * 문제 : 정수 n 개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * 
 * 함수를 작성하는 문제.
 * Test, long 형태 return
 * 참고 : https://st-lab.tistory.com/52
 */

class Test {
    long sum(int[] a) {
		long sum = 0;
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}