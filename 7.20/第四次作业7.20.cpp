#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<math.h>

//1.打印0-999999的水仙花数
//count函数用来计算数字的位数
int count(int n)
{
	int count = 0;
	while (n != 0)
	{
		n = n / 10;
		count++;
	}
	return count;
}


int main()
{
	int i;
	for (i = 0; i < 1000000; i++)
	{
		
		int sum = 0;
		int tmp = 0;
		int k = count(i);
		tmp = i;
		while (tmp!=0)
		{
			sum=sum+pow((double)(tmp%10),(double) k);
			tmp= tmp / 10;
		}
		if (i== sum)
		{
		   printf("%d ", i);
		}
	}
	system("pause");
	return 0;
}


//2.求Sn = a + aa + aaa + aaaa + aaaaa的前n项之和，其中a是一个数字
//int main()
//{
//	int n = 0;
//	int a = 0;                          
//	int sum = 0;
//	int count = 0;                      //count用来计数加到第几位
//	int tmp = 0;
//	printf("请输入a的值：", a);
//	scanf("%d", &a);
//	printf("您要计算前几项之和：", n);
//	scanf("%d", &n);
//	tmp = a;
//	while (count!=n)
//	{
//		sum = sum + tmp;
//		tmp=(10*tmp) + a;
//		count++;
//	}
//	printf("sum=%d\n", sum);
//	system("pause");
//	return 0;
//}
//另一种
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	int a = 2;
	int n = 0;
	int sum = 0;
	int tmp = 0;
	int count = 0;
	printf("您要求前几项之和：");
	scanf("%d", &n);
	tmp = a;
	while (count != n)
	{
		sum += tmp;
		tmp = (tmp * 10) + a;
		count++;
	}
	printf("sum=%d\n", sum);
	system("pause");
	return 0;
}
