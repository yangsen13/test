package test;
/**
 *�ڶ���
 *����һ��������������֮�͵����ֵ
 * @author Administrator
 *
 */
public class Test2 {
	static int[] arr = {5,-3,2,4};// ��Ҫ�������
	static int maxIndex = arr.length - 1;// ���������±�

	public static void main(String[] args) {
		findMaxArr2();
		System.out.println("\n-------------");
	}

	// 2.����forѭ�����
	static void findMaxArr2() {
		int max = arr[0];// ���ֵ
		int sum;// ���
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i <= maxIndex; i++) {
			sum = 0;
			for (int j = i; j <= maxIndex; j++) {
				sum += arr[j];
				if (sum > max) {
					max = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("���ֵΪ��" + max);
		printArr(startIndex, endIndex);
	}

	// �����±꿪ʼ����ֵ����ӡ����
	static void printArr(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}