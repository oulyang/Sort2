package m3d6;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,11,8,54};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void insertSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int insertNum=arr[i];
			int insertIndex=i-1;//arr[1]的前一个数的下标
			while(insertIndex>=0&&insertNum<arr[insertIndex]) {
				arr[insertIndex+1]=arr[insertIndex];
				insertIndex--;
			}
			//当退出循环即找到插入位置为insertIndex+1
			if(insertIndex!=i) {
				arr[insertIndex+1]=insertNum;
			}
		}
		/*
		//第一轮{12,11,412,22,54}=>{11,12,412,22,54}
		//定义待插入的数
		int insertNum=arr[1];
		int insertIndex=1-1;//arr[1]的前一个数的下标
		
		//给insertNum找到插入位置
		//insertIndex>=0保障插入位置不越界
		//insertNum<arr[insertIndex]表示待插入数未找到插入位置
		//arr[insertIndex]后移
		while(insertIndex>=0&&insertNum<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		//当退出循环即找到插入位置为insertIndex+1
		arr[insertIndex+1]=insertNum;
		
		
		//第二轮
		insertNum=arr[2];
		insertIndex=2-1;//arr[2]的前一个数的下标
		while(insertIndex>=0&&insertNum<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertNum;
		
		//第三轮
		insertNum=arr[3];
		insertIndex=3-1;//arr[2]的前一个数的下标
		while(insertIndex>=0&&insertNum<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertNum;
		*/
	}
}
