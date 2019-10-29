//编写代码, 演示多个字符从两端开始移动, 向中间汇聚
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
	char arr1[] = { "you are a big pig" };
	char arr2[] = { "#################" };
	int left = 0;
	int right = strlen(arr1) - 1;
	while (left <= right)
	{
		arr2[left] = arr1[left];
		arr2[right] = arr1[right];
		left++;
		right--;
		printf("%s\n", arr2);
		system("cls");           //清除上一个回车内容 

	}
	system("pause");
	return 0;
}