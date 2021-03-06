package m3d6;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-80,-90,213,12,4,64,788};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		int[] array=new int[80000];
		for(int i = 0; i<80000;i++) {
			array[i]=(int) (Math.random()*8000000);
		}	
		Date d1=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String s1=sdf1.format(d1);
		System.out.println(s1);
		quickSort(array,0,array.length-1);
		
		Date d2=new Date();
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String s2=sdf1.format(d2);
		System.out.println(s2);
	}
	public static void quickSort(int[] arr,int left, int right) {
		int l = left;
		int r = right;
		int pivot = arr[(left + right) / 2];//����ֵ
		int temp = 0;
		//������ֵС�ķ���ߣ���ķ��ұ�
		while (l < r) {
			//������ֵ���һֱ�ң��ҵ���������ֵ�Ĳ��˳�
			while (arr[l] < pivot) {
				l += 1;
			}
			
			//������ֵ�ұ�һֱ�ң��ҵ�С������ֵ�Ĳ��˳�
			while (arr[r] > pivot) {
				r -= 1;
				}
			//��ʱ����ֵ���ȫ��С������ֵ���ұ�ȫ����������ֵ
			if (l >= r) {
				break;
				}
			
			//����
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			//���������arr[l]==pivot
			if (arr[l] == pivot) {
				r -= 1;
				}
			//���������arr[r]==pivot
			if (arr[r] == pivot) {
				l += 1;
			}		
		}
		//���l==r,����l++,r--,�������ջ���
		if (l == r) {
			l += 1;
			r -= 1;
		}
		//����ݹ�
		if (left < r) {
			quickSort(arr,left, r );
		}
		if (right > l) {
			quickSort(arr,l, right);
		}
	}
}