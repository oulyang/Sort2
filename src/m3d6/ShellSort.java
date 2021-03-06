package m3d6;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr= {2,3,5,1,4,7,6,0,9,8};
		System.out.println(Arrays.toString(arr));
		//ShellSort.shellSort1(arr);
		shellSort2(arr);
		System.out.println(Arrays.toString(arr));
		*/
		int[] array=new int[80000];
		for(int i = 0; i<80000;i++) {
			array[i]=(int) (Math.random()*8000000);
		}	
		Date d1=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String s1=sdf1.format(d1);
		System.out.println(s1);
		shellSort2(array);
		
		Date d2=new Date();
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String s2=sdf1.format(d2);
		System.out.println(s2);
	}
	
	public static void shellSort2(int[] arr) {
		//��λ��
		for(int gap = arr.length/2 ; gap > 0;gap /= 2 ) {
			//�ӵ�gap��Ԫ������������������ֱ�Ӳ�������
			for(int i=gap;i<arr.length;i++) {
				int j=i;
				int temp=arr[j];
				if(arr[j]<arr[j-gap]) {
					while(j-gap>=0&&temp<arr[j-gap]) {
						//�ƶ�
						arr[j]=arr[j-gap];
						j-=gap;
					}
					//�˳�ѭ�����ҵ��˲����λ��
					arr[j]=temp;
				}
			}
		}
	}
	public static void shellSort1(int[] arr) {
		
		//������
		int temp=0;
		for(int gap = arr.length/2 ; gap > 0;gap /= 2 ) {
			for(int i=gap;i<arr.length;i++) {
				for(int j=i-gap;j>=0;j-=gap) {
					//�����ǰԪ�ش��ڼ��ϲ������Ԫ�أ��򽻻�
					if(arr[j]>arr[j+gap]) {
						temp=arr[j];
						arr[j]=arr[j+gap];
						arr[j+gap]=temp;
					}
				}
			}
		}
		
		/*
		int temp=0;
		//��һ��:��10������Ϊ10/2=5��
		for(int i=5;i<arr.length;i++) {
			//���������е�Ԫ�أ�����5
			for(int j=i-5;j>=0;j-=5) {
				//�����ǰԪ�ش��ڼ��ϲ������Ԫ�أ��򽻻�
				if(arr[j]>arr[j+5]) {
					temp=arr[j];
					arr[j]=arr[j+5];
					arr[j+5]=temp;
				}
			}
		}
		
		//�ڶ���
		//��10������Ϊ5/2=2��
		for(int i=2;i<arr.length;i++) {
			//���������е�Ԫ�أ�����5
			for(int j=i-2;j>=0;j-=2) {
				//�����ǰԪ�ش��ڼ��ϲ������Ԫ�أ��򽻻�
				if(arr[j]>arr[j+2]) {
					temp=arr[j];
					arr[j]=arr[j+2];
					arr[j+2]=temp;
				}
			}
		}
		
		//������
		//��10������Ϊ2/2=1��
		for(int i=1;i<arr.length;i++) {
			//���������е�Ԫ�أ�����5
			for(int j=i-1;j>=0;j-=1) {
				//�����ǰԪ�ش��ڼ��ϲ������Ԫ�أ��򽻻�
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		*/
	}
}
