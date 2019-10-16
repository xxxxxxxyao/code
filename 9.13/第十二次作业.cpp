#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

//1.编写函数：
//unsigned int reverse_bit(unsigned int value);
//这个函数的返回值是value的二进制位模式从左到右翻转后的值。
//unsigned int reverse_bit(unsigned int value)
//{
//	int sum = 0;
//	int i = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if ((value >> i) & 1 == 1)
//		{
//			sum = sum + pow((double)2, 31 - i);
//		}
//	}
//
//	return sum;
//}
//
//int main()
//{
//	unsigned int i = 0;
//	printf("请输入一个数:", i);
//	scanf("%d", &i);
//	unsigned int b = reverse_bit(i);
//	printf("%u\n", b);
//	system("pause");
//	return 0;
//}




//2.不使用（a + b） / 2这种方式，求两个数的平均值。



//int main()
//{
//	int a = 30;
//	int b = 20;
//	int i = 0;
//    i = ((a-b) / 2) + b;
//	printf("%d\n", i);
//	system("pause");
//	return 0;
//}



//还可以用&和^运算
//int Avg(int a, int b)
//{
//	int avg = 0;
//	avg = (a&b) + (a^b) >> 1;  //右移一位代表除2；左移一位代表乘2
//	return avg;
//}
//
//int main()
//{
//	printf("%d\n", Avg(10, 20));
//	system("pause");
//	return 0;
//}


//3.编程实现：一组数据中只有一个数字出现了一次。其他所有数字都是成对出现的。请找出这个数字。（使用位运算）

//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };         //1 3 5 2 1 3 5 7有两个不同的应该怎么办呢？将2和7划分到两个数组
//	int len = sizeof(arr) / sizeof arr[0];
//	int i = 0;
//	int tmp = 0;
//	for (i = 0; i < len; i++)
//	{
//		tmp = tmp^arr[i];
//	}
//	printf("%d\n", tmp);
//	system("pause");
//	return 0;
//}



//4.
//有一个字符数组的内容为:"student a am i",
//			请你将数组的内容改为"i am a student".
//			要求：
//			不能使用库函数。
//			只能开辟有限个空间（空间个数和字符串的长度无关）。

//int MyStrlen(char *str)
//{
//	int len = 0;
//	while (*str != '\0')
//	{
//		len++;
//		str++;
//	}
//	return len;
//}
//
//void ReverseStr(char *str, char *left, char *right)
//{
//	while (left < right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//
//void ReverseSentence(char *str)
//{
//	int len = MyStrlen(str);
//	char *cur = str;
//	char *left = str;
//	char *right = str + len - 1;
//	ReverseStr(str, left, right);//tned.......
//	while (*cur != '\0')
//	{
//		char *start = cur;
//		while (*cur != ' ' && *cur != '\0')
//		{
//			cur++;
//		}
//		ReverseStr(str, start, cur - 1);
//		if (*cur == ' ')
//		{
//			cur++;
//		}
//	}
//}
//
//int main()
//{
//	char arr[] = "i am a student";
//	ReverseSentence(arr);
//	printf("%s\n", arr);
//	system("pause");
//	return 0;
//}


