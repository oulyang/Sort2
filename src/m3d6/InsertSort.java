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
			int insertIndex=i-1;//arr[1]��ǰһ�������±�
			while(insertIndex>=0&&insertNum<arr[insertIndex]) {
				arr[insertIndex+1]=arr[insertIndex];
				insertIndex--;
			}
			//���˳�ѭ�����ҵ�����λ��ΪinsertIndex+1
			if(insertIndex!=i) {
				arr[insertIndex+1]=insertNum;
			}
		}
		/*
		//��һ��{12,11,412,22,54}=>{11,12,412,22,54}
		//������������
		int insertNum=arr[1];
		int insertIndex=1-1;//arr[1]��ǰһ�������±�
		
		//��insertNum�ҵ�����λ��
		//insertIndex>=0���ϲ���λ�ò�Խ��
		//insertNum<arr[insertIndex]��ʾ��������δ�ҵ�����λ��
		//arr[insertIndex]����
		while(insertIndex>=0&&insertNum<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		//���˳�ѭ�����ҵ�����λ��ΪinsertIndex+1
		arr[insertIndex+1]=insertNum;
		
		
		//�ڶ���
		insertNum=arr[2];
		insertIndex=2-1;//arr[2]��ǰһ�������±�
		while(insertIndex>=0&&insertNum<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertNum;
		
		//������
		insertNum=arr[3];
		insertIndex=3-1;//arr[2]��ǰһ�������±�
		while(insertIndex>=0&&insertNum<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertNum;
		*/
	}
}
