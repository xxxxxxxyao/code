#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>


//1.дһ���������ز����������� 1 �ĸ���
//int Count_one_bits(unsigned int x)
//{
//	int count = 0;
//	while (x != 0)
//	{
//		if (x % 2 == 1)
//			count++;
//		x = x / 2;
//	}
//	return count;
//}
//int main()
//{
//	int i = 0;
//	printf("����һ������", i);
//	scanf("%u", &i);
//	int b=Count_one_bits(i);
//	printf("��%d��1\n", b);
//	system("pause");
//	return 0;
//}



//2.��ȡһ�������������������е�ż��λ������λ���ֱ�������������С�

//void Fun1(int num)
//{
//	int i = 0;
//	for (i = 31; i >= 1; i -= 2)//ż��λ
//	{
//		printf("%d ", (num >> i) & 1);
//	}
//	for (i = 30; i >= 0; i -= 2)//����λ
//	{
//		printf("%d ", (num >> i) & 1);
//	}
//}
//
//int main()
//{
//	int i = 0;
//	printf("������һ������", i);
//	scanf("%d", &i);
//	Fun1(i);
//	printf("\n");
//	system("pause");
//	return 0;
//}


//3. ���һ��������ÿһλ��

//void Fun(int x)
//{
//	if (x != 0)
//	{
//		Fun(x / 10);
//		printf("%d ", x % 10);
//	}
//
//}
//
//int main()
//{
//	int i = 0;
//	printf("������һ����:", i);
//	scanf("%d", &i);
//	Fun(i);
//	system("pause");
//	return 0;
//}


//4.���ʵ�֣�����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��

//int Fun(int x, int y)
//{
//	int a = x^y;
//	int count = 0;
//	while (a != 0)
//	{
//		if (a % 2 == 1)
//			count++;
//		a = a / 2;
//	}
//	return count;
//}
//
//int main()
//{
//	int m = 0;
//	int n = 0;
//	printf("��������������",m, n);
//	scanf("%d %d", &m, &n);
//	int b=Fun(m, n);
//	printf("��%d������λ��ͬ\n", b);
//	system("pause");
//	return 0;
//}