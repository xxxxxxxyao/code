#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
//1.实现一个函数，打印乘法口诀表，口诀表的行数和列数自己指定，输入9，输出9 * 9口诀表，输入12，输出12 * 12的乘法口诀表。
//void Show(int x)
//{
//	int i, j, k;
//	for (i = 1; i <= x; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			k = i*j;
//			printf("%d*%d=%d  ", i, j, k);
//		}
//		printf("\n");
//	}
//}
//
//int main()
//{
//	int a = 0;
//	printf("你要计算几的阶乘：", a);
//	scanf("%d", &a);
//	Show(a);
//	system("pause");
//	return 0;
//}
//
//2.使用函数实现两个数的交换。
//int Swap(int *px, int *py)
//{
//	int tmp = *px;
//	*px = *py;
//	*py = tmp;
//	return 0;
//}
//
//int main()
//{
//	int a = 99;
//	int b = 12;
//	Swap(&a, &b);
//	printf("a=%d,b=%d\n", a, b);
//	system("pause");
//	return 0;
//}
//
//
//
//3.实现一个函数判断year是不是润年。
//int YearLeap(int x)
//{
//	if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
//	{
//		return 1;
//	}
//	return 0;
//}
//
//
//int main()
//{
//	int a = 0;
//	printf("请输入年份：",a);
//	scanf("%d", &a);
//	if ((YearLeap(a) == 1))
//	{
//		printf("%d是闰年\n", a);
//	}
//	if ((YearLeap(a) == 0))
//	{
//		printf("%d不是闰年\n", a);
//	}
//	system("pause");
//	return 0;
//}
//
//
//4.创建一个数组，实现函数init（）初始化数组、实现empty（）清空数组、实现reverse（）函数完成数组元素的逆置。要求：自己设计函数的参数，返回值。
//void Menu()
//{
//	printf("******请选择功能******\n");
//	printf("*******1.初始化*******\n");
//	printf("*******2.使清空*******\n");
//	printf("*******3.使逆置*******\n");
//}
//
//void Show(int arr[],int len)
//{
//	int i = 0;
//	for (i = 0; i < len; i++)
//	{
//		printf("%d", arr[i]);
//	}
//	printf("\n");
//}
//
//void Init(int arr[],int len)
//{
//	int i = 0;
//	int j = 1;
//	for (i = 0; i < len; i++)
//	{
//		arr[i] = j;
//	}
//}
//
//
//void  Empty(int arr[],int len)
//{
//	memset (arr, 0,sizeof (arr[0])*len);
//}
//
//
//void Reverse(int arr2[],int len)
//{
//	int left = 0;
//	int right = len-1;
//	for (; left < right; left++, right--)
//	{
//		int tmp = arr2[left];
//		arr2[left] = arr2[right];
//		arr2[right] = tmp;
//	}
//}
//
//
//int main()
//{	
//	int i = 0;
//	do
//	 {
//	   int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
//	   int len = sizeof(arr1) / sizeof(arr1[0]);
//	   Menu();
//	   printf("请选择：",i);
//	   scanf("%d", &i);
//	   switch (i)
//		   {
//		   case 3:
//			   Reverse(arr1, len);
//			   Show(arr1, len);
//			   break;
//		   case 2:
//			   Empty(arr1,len);
//			   Show(arr1, len);
//			   break;
//		   case 1:
//			   Init(arr1, len);
//			   Show(arr1, len);
//			   break;
//		   default:
//			   printf("重新选择\n");
//			   break;
//		   }
//	   } while (i);
//	 system("pause");
//	 return 0;
//}





//5.实现一个函数，判断一个数是不是素数。
int Show(int x)
{
	int i = 0;
	for (i = 2; i < x; i++)
	{
		if (x%i == 0)
		{
			return 1;
			break;
		}
	  }   
	if (i==x)
		{
			return 0;
		}
	 return x;
}


int main()
{
	int a = 0;
	printf("输入要判断的数：", a);
	scanf("%d", &a);
	if (Show(a) == 1)
	{
		printf("%d不是素数\n", a);
	}
	if (Show(a) == 0)
	{
		printf("%d是素数\n", a);
	}
	system("pause");
	return 0;
}