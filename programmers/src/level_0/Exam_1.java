package level_0;

/*
 * Day 1 사칙연산 
 * - 두 수의 합
 * - 두 수의 차
 * - 두 수의 곱 
 * - 몫 구하기 
 */
public class Exam_1 {
	
	public static void main(String[] args) {
		Exam_1 exam = new Exam_1();
		int result = exam.solution(1, 2);
		System.out.println(result);
	}
	
	public int solution(int num1, int num2) {
        return num1 + num2;
    }

}