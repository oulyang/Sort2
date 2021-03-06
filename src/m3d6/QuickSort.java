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
		int pivot = arr[(left + right) / 2];//中轴值
		int temp = 0;
		//比中轴值小的放左边，大的放右边
		while (l < r) {
			//在中轴值左边一直找，找到大于中轴值的才退出
			while (arr[l] < pivot) {
				l += 1;
			}
			
			//在中轴值右边一直找，找到小于中轴值的才退出
			while (arr[r] > pivot) {
				r -= 1;
				}
			//此时中轴值左边全部小于中轴值，右边全部大于中轴值
			if (l >= r) {
				break;
				}
			
			//交换
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			//如果交换后arr[l]==pivot
			if (arr[l] == pivot) {
				r -= 1;
				}
			//如果交换后arr[r]==pivot
			if (arr[r] == pivot) {
				l += 1;
			}		
		}
		//如果l==r,必须l++,r--,否则出现栈溢出
		if (l == r) {
			l += 1;
			r -= 1;
		}
		//向左递归
		if (left < r) {
			quickSort(arr,left, r );
		}
		if (right > l) {
			quickSort(arr,l, right);
		}
	}
}