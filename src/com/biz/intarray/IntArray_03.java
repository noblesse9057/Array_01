package com.biz.intarray;

public class IntArray_03 {

	public static void main(String[] args) {
		/*
		 * �������� �����Ҽ� �ִ� �������� 30�� �����ϰ�
		 * �� �������� ��ǥ�̸� intKor�� �ٿ���.
		 * 
		 * ==> int��(type) �迭 30���� �����
		 * 		��ǥ�̸����� intKor�� �ٿ���
		 * 
		 * ==>30���� ���ӵ� �������� �����ϰ�
		 *  ó������ ������ 0�� �����Ͽ�
		 *  �������� ������ ������ �ּҰ��� �ٿ�������.
		 */

		int[] intKor = new int[30];

		// 30���� ȣ���� �ִ� intKor�� ���� ������ ����
		intKor[0] = 90;
		intKor[1] = 80;
		intKor[2] = 70;
		intKor[3] = 88;
		intKor[4] = 66;
		intKor[5] = 89;
		intKor[6] = 85;
		intKor[7] = 90;
		
		// �迭�� �Ϲ� ������ �޸�
		// �׹迭�� Ȱ���Ҷ� for �ݺ����� ����Ҽ� �ִ� Ư¡
		int intSum =0 ;
		for(int i = 0; i < 8 ; i++) {
			intSum += intKor[i];
		}
		
		intSum = 0;
		intSum += intKor[0];
		intSum += intKor[1];
		intSum += intKor[2];
		intSum += intKor[3];
		intSum += intKor[4];
		intSum += intKor[5];
		intSum += intKor[6];
		intSum += intKor[7];
	}

}
