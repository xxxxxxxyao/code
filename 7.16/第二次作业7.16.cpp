//1.��������ֵ
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

//int main()
//{
//	int a, b, c;
//	a = 0;
//	b = 0;
//	printf("������a��b��ֵ",a,b );
//	scanf("%d%d", &a, &b);
//	c = a;
//	a = b;
//	b = c;
//	printf("a=%d b=%d\n", a, b);
//    system("pause");
//	return 0;
//}


//2.����������ʱ���������������������ݣ������⣩   // Ч�ʲ���--->��������򣬰�λ���(��������ͬ��֮����л����㣻������ͬ��������Ϊ0)
//int main()
//{
//	int a, b;
//	a = 0;
//	b = 0;
//	printf("������a��b��ֵ", a, b);
//	scanf("%d%d", &a, &b);
//	a = a + b;                                     //a=a^b;          
//	b = a - b;                                     //b=a^b;
//	a = a - b;                                     //a=a^b;
//	printf("a=%d b=%d\n", a, b);
//	system("pause");
//	return 0;
//}



//3.��10�����������ֵ
//int main()
//{
//	int i, max, num;
//	for (i = 0; i<10; i++)
//	{
//		printf("�������%d����:", i+1);
//		scanf("%d", &num);
//		if (i == 0) max = num;
//		else
//		if (max<num) max = num;
//	}
//	printf("max=%d\n", max);
//	system("pause");
//	return 0;
//}


//4.�����������Ӵ�С�����
//int main()
//{
//	int a, b, c;
//	a = 0;
//	b = 0;
//	c = 0;
//	int x = 0;
//	printf("������������\n", a,b,c);
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


//5.�������������Լ��������Ϊ0��ʱ�򣬳����������Լ��      Ҳ������շת�����
int main()
{
	int i, a, b;
	i = 0;
	a = 0;
	b = 0;
	printf("������������a��b��", a, b);
	scanf("%d%d", &a, &b);
    for (i = a; i >= 2; i--)
   {
	   if (a%i == 0 && b%i == 0)
	   {
		   printf("���Լ��Ϊ%d\n", i);
		   break;
	   }
   }
   if (i == 1)
   {
	   printf("���Լ��i=1\n", i);
   }
	system("pause");
	return 0;
}
 //�������Ż�   ���÷�����շת�����
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
	printf("���Լ��Ϊ%d\n", c);
   system("pause");
	return 0;
}