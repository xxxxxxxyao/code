//1. 将数组A中的内容和数组B中的内容进行交换。（数组一样大）      本代码的缺点：不能自己输入数组的数据
#define _CRT_SECURE_NO_WARNINGS 1                   
#include<stdio.h>
#include<stdlib.h>
//void change(char arr1[], char arr2[])
//{
//	int i = 0;
//	for (i = 0; i < 5; i++)
//	{
//		int tmp = arr1[i];
//		arr1[i] = arr2[i];
//		//;;;;;代表空语句，不会报错
//		arr2[i] = tmp;
//	}
//
//}
//int main()
//{
//	char arr1[6] = { "12345" };
//	char arr2[6] = { "67890" };
//    change(arr1, arr2);
//	printf("arr1=%s  arr2=%s\n", arr1, arr2);
//	system("pause");
//	return 0;
//}
//另一种交换
//#define _CRT_SECURE_NO_WARNINGS 1
//#include<stdio.h>
//#include<stdlib.h>
//
//void output(int arr[], int n)
//{
//
//	for (n = 0; n < 3; n++)
//	{
//		printf("%d", arr[n]);
//	}
//}
//int main()
//{
//	int arr1[3] = { 1, 2, 3 };
//	int arr2[3] = { 2, 3, 4 };
//	int arrtmp[3];
//	int i;
//	for (i = 0; i < 3; i++)
//	{
//		arrtmp[i] = arr1[i];
//		arr1[i] = arr2[i];
//		arr2[i] = arrtmp[i];
//	}
//	output(arr1, 3);
//	printf("\n");
//	output(arr2, 3);
//	system("pause");
//	return 0;
//}


//2. 计算1 / 1 - 1 / 2 + 1 / 3 - 1 / 4 + 1 / 5 …… + 1 / 99 - 1 / 100 的值。

//int main()
//{
//	float i = 0;
//	float j = 0;
//	float sum1 = 0;
//	float sum2 = 0;
//	float sum = 0;
//	for (i = 1; i < 100; i += 2)
//	{
//		sum1 = sum1 + (1 / i);
//    }
//		for (j = 2; j <= 100; j += 2)
//		{
//			sum2 = sum2 -(1 / j);
//		}
//		sum = sum1 + sum2;
//		printf("sum=%f\n", sum);
//	
//	system("pause");
//	return 0;
//}
//可以定义一个flag
//flg = 1;
//sum = sum + flg*1.0 / i;
//flg = -flg;



//3. 编写程序数一下1到 100 的所有整数中出现多少个数字9。
int main()
{
	int i = 0;
	int count = 0;
	for (i = 1; i <= 100; i++)
	{
		if ((i % 10 == 9) 
		{
			count++;
		}
		if (i / 10 == 9)
		{
			count++;
		}
	}
	printf("count=%d\n", count);
	system("pause");
	return 0;
}
