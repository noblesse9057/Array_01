package com.biz.stringarray;

public class StrArray_05 {

	public static void main(String[] args) {

		String strName = "ȫ�浿�̸��漺����";
		
		// ���ڿ�.split("") �޼���� ���ڿ�(����)�� ��� ���ڿ�����
		// �ѱ��ھ� �����ؼ� ���ڿ� ������ŭ�� �迭�� �������ش�.
		
		String[] strNames = strName.split("");
		for(int i=0; i<strNames.length; i++) {
			System.out.println(strNames[i]);
		}
		
		int intNum =10;
		int intNum2 = intNum +100;
				
	}
	// makeString() �޼����� ���¸� �����
	// �����Ǳ�ü���� ����� �ۼ����� ���� ����
	// �̷� �ڵ带 proto type�̶�� �Ѵ�.
	// ���� proto type�� ���������
	// void���� �ƴѰ�쿡 return���� ������ �ϴµ�
	// return���� �����̸� return0�̶�� �ۼ��ϰ�
	// �׿� ���� ���� return null�̶�� �ۼ��Ѵ�.
	public static String[] makeString(String strNations) {
		return null;//�ڵ带 ������� �ӽù���
		
	}
}
