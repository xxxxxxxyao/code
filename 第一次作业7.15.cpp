#include<stdio.h>
#include<stdlib.h>
//1.100-200之间素数
//方法：试除法   进行优化 开根号之后可以再排除偶数
int main()
{
	int i, j;
	int count = 0;
	for (i = 100; i <= 200; i++)
	{
		for (j = 2; j <= i - 1; j++)    //优化：for(j=2;j<=i/2;j++)
		{
			if (i%j == 0)             
			break;                     //跳出当前循环
		}
		if (i==j)                      //一种是上面跳出了；一种是没有进入上面的循环，即i=j；//优化：if (j>i/2) 就输出
       count++；
		printf("%d\n",i);
		printf("count=%d\n", count);
	}
	system("pause");
    return 0;
}

//2.九九乘法表    优化成直角三角形
//int main()
//{
//	int i,j,k;
//	for (i = 1; i <= 9; i++)
//	{
//		for (j = 1; j <= 9; j++)    //for(j=1;j<=i;j++)
//		{
//			 k=i*j;
//			 printf("  %d*%d=%d", i, j, k);
//		}
//      printf("\n");
//	}
//	system("pause");
//	return 0;
//}


//3.判断闰年
//int main()
//{
//	int i;
//	for (i = 1000; i <= 2000; i++)
//	{
//		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
//			printf(" %d", i);
//	}
//	system("pause");
//	return 0;
//}

