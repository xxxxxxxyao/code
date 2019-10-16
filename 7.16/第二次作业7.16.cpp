//1.交换两个值
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

//int main()
//{
//	int a, b, c;
//	a = 0;
//	b = 0;
//	printf("请输入a，b的值",a,b );
//	scanf("%d%d", &a, &b);
//	c = a;
//	a = b;
//	b = c;
//	printf("a=%d b=%d\n", a, b);
//    system("pause");
//	return 0;
//}


//2.不允许创建临时变量，交换两个数的内容（附加题）   // 效率不高--->可以用异或，按位异或(两个不相同，之间进行或运算；两个相同，运算结果为0)
//int main()
//{
//	int a, b;
//	a = 0;
//	b = 0;
//	printf("请输入a，b的值", a, b);
//	scanf("%d%d", &a, &b);
//	a = a + b;                                     //a=a^b;          
//	b = a - b;                                     //b=a^b;
//	a = a - b;                                     //a=a^b;
//	printf("a=%d b=%d\n", a, b);
//	system("pause");
//	return 0;
//}



//3.求10个整数中最大值
//int main()
//{
//	int i, max, num;
//	for (i = 0; i<10; i++)
//	{
//		printf("请输入第%d个数:", i+1);
//		scanf("%d", &num);
//		if (i == 0) max = num;
//		else
//		if (max<num) max = num;
//	}
//	printf("max=%d\n", max);
//	system("pause");
//	return 0;
//}


//4.将三个数按从大到小输出。
//int main()
//{
//	int a, b, c;
//	a = 0;
//	b = 0;
//	c = 0;
//	int x = 0;
//	printf("请输入三个数\n", a,b,c);
//	scanf("%d%d%d",&a,&b,&c);
//	if (a < b)
//	{
//		x = a;
//		a = b;
//		b = x;
//     }
//	if (a < c)
//	{
//		x = a;
//		a = c;
//		c = x;
//	}
//	if (b < c)
//	{
//		x = b;
//		b = c;
//		c = x;
//	}
//
//	printf("%d %d %d\n",a,b,c);
//    system("pause");
//	return 0;
//	}


//5.求两个数的最大公约数。余数为0的时候，除数就是最大公约数      也可以用辗转相除法
int main()
{
	int i, a, b;
	i = 0;
	a = 0;
	b = 0;
	printf("请输入两个数a，b：", a, b);
	scanf("%d%d", &a, &b);
    for (i = a; i >= 2; i--)
   {
	   if (a%i == 0 && b%i == 0)
	   {
		   printf("最大公约数为%d\n", i);
		   break;
	   }
   }
   if (i == 1)
   {
	   printf("最大公约数i=1\n", i);
   }
	system("pause");
	return 0;
}
 //第五题优化   所用方法：辗转相除法
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int  a, b, c;

	a = 24;
	b = 18;
	c = 0;
	while ((a%b) != 0)
	{
		c = a%b;
		b = c;
		a = b;
	}
	printf("最大公约数为%d\n", c);
   system("pause");
	return 0;
}