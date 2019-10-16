#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
//1.完成猜数字游戏。
//int main()
//{
//	int i = 0;
//	int a = 0;
//	srand(time(0));                             
//	i = rand() % 100 + 1;                      //产生一个随机种子,产生1-100的随机数
//	printf("*****猜数游戏开始*****\n");
//	loop: printf("你猜测的数是：", a);
//	scanf("%d", &a);
//	while (a!=i)
//	{
//		if (a < i)
//		{
//			printf("再往大的猜一下吧！\n", a);
//			goto loop;
//		}
//		else
//		{
//			printf("再往小的猜一下吧！\n", a);
//			goto loop;
//		}			
//	 }
//	printf("哈哈哈恭喜你终于猜对了！!\n");
//  system("pause");
//	return 0;
//}


//2.写代码可以在整型有序数组中查找想要的数字，找到了返回下标，找不到返回 - 1.（折半查找）
//int main()
//{
//	int j = 0;
//	int low = 0;
//	int high = 0;
//	int arr[10] = { 3, 4, 12, 14, 23, 24, 56, 78, 89, 98 };
//	high = (sizeof(arr) / sizeof(arr[0]))-1;
//	printf("请输入您要查找的数：",j);
//	scanf("%d", &j);
//    while (low <= high)
//	{
//	    int mid = (low + high) / 2;
//		if (arr[mid] < j)
//		{
//			low = mid + 1;
//		}
//	    else if (arr[mid]>j)
//		{
//			high = mid - 1;
//		}
//		else 
//		{
//			printf("找到了！下标为：%d\n", mid);
//			break;
//		}
//	}
//	if (low > high)
//	{
//		return -1;
//	}
//	system("pause");
//}


//老师写的
//int binsearch(int key, int arr[], int len)
//{
//	int left = 0;
//	int right = len - 1;
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] < key)
//		{
//			left = mid + 1;
//		}
//		else if (arr[mid]> key)
//		{
//			right = mid - 1;
//		}
//		else
//		{
//			return mid;
//		}
//	}
//	if (left > right)
//	{
//		return -1;
//	}
//}


//int main()
//{
//	int arr[] = { 2, 8, 11, 56, 66, 77, 88, 99 };
//	int len = sizeof(arr) / sizeof(arr[0]);
//	int index = binsearch(11, arr, len);
//	printf("index=%d\n", index);
//	system("pause");
//	return 0;
//}







//3.编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，提示“登录成功”, 密码错误，
//可以重新输入，最多输入三次。三次均错，则提示退出程序。
//int main()
//{
//	
//	char arr[4] = { 0 };
//	int i = 0;
//	for (i = 1; i < 4;i++)
//	{
//		printf("请输入密码：");
//		scanf("%s", arr);
//		if (0==strcmp(arr,"226"))
//		{
//			printf("登录成功！\n");
//			break;
//		}
//		else
//		{
//			printf("密码错误!\n");
//		}
//	 }
//	if (i == 4)
//	{
//		return -1;
//	}
//	system("pause");
//}



//4.编写一个程序，可以一直接收键盘字符，如果是小写字符就输出对应的大写字符，
//如果接收的是大写字符，就输出对应的小写字符，如果是数字不输出。123ABCD45efG == > abcdEFg

int main()
{
	int i = 0;
	printf("请输入字符：", i);
	scanf("%c",&i);
	while((i = getchar()) != EOF)
	{
		if (i>= 65 && i <= 90)
		{
			i = i + 32;
			printf("%c", i);
		}
	    else if (i >= 97 && i <= 122)
		{
			i = i - 32;
		   printf("%c", i);
		}
		else if (i >= '0'&&i <= '9')
		{
			;
		}
	}
	system("pause");
	return 0;
}
