#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>


//1.写一个函数返回参数二进制中 1 的个数
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
//	printf("输入一个数：", i);
//	scanf("%u", &i);
//	int b=Count_one_bits(i);
//	printf("有%d个1\n", b);
//	system("pause");
//	return 0;
//}



//2.获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。

//void Fun1(int num)
//{
//	int i = 0;
//	for (i = 31; i >= 1; i -= 2)//偶数位
//	{
//		printf("%d ", (num >> i) & 1);
//	}
//	for (i = 30; i >= 0; i -= 2)//奇数位
//	{
//		printf("%d ", (num >> i) & 1);
//	}
//}
//
//int main()
//{
//	int i = 0;
//	printf("请输入一个数：", i);
//	scanf("%d", &i);
//	Fun1(i);
//	printf("\n");
//	system("pause");
//	return 0;
//}


//3. 输出一个整数的每一位。

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
//	printf("请输入一个数:", i);
//	scanf("%d", &i);
//	Fun(i);
//	system("pause");
//	return 0;
//}


//4.编程实现：两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？

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
//	printf("请输入两个数：",m, n);
//	scanf("%d %d", &m, &n);
//	int b=Fun(m, n);
//	printf("有%d个比特位不同\n", b);
//	system("pause");
//	return 0;
//}