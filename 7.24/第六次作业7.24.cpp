#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
//1.ʵ��һ����������ӡ�˷��ھ����ھ���������������Լ�ָ��������9�����9 * 9�ھ�������12�����12 * 12�ĳ˷��ھ���
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
//	printf("��Ҫ���㼸�Ľ׳ˣ�", a);
//	scanf("%d", &a);
//	Show(a);
//	system("pause");
//	return 0;
//}
//
//2.ʹ�ú���ʵ���������Ľ�����
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
//3.ʵ��һ�������ж�year�ǲ������ꡣ
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
//	printf("��������ݣ�",a);
//	scanf("%d", &a);
//	if ((YearLeap(a) == 1))
//	{
//		printf("%d������\n", a);
//	}
//	if ((YearLeap(a) == 0))
//	{
//		printf("%d��������\n", a);
//	}
//	system("pause");
//	return 0;
//}
//
//
//4.����һ�����飬ʵ�ֺ���init������ʼ�����顢ʵ��empty����������顢ʵ��reverse���������������Ԫ�ص����á�Ҫ���Լ���ƺ����Ĳ���������ֵ��
//void Menu()
//{
//	printf("******��ѡ����******\n");
//	printf("*******1.��ʼ��*******\n");
//	printf("*******2.ʹ���*******\n");
//	printf("*******3.ʹ����*******\n");
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
//	   printf("��ѡ��",i);
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
//			   printf("����ѡ��\n");
//			   break;
//		   }
//	   } while (i);
//	 system("pause");
//	 return 0;
//}





//5.ʵ��һ���������ж�һ�����ǲ���������
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
	printf("����Ҫ�жϵ�����", a);
	scanf("%d", &a);
	if (Show(a) == 1)
	{
		printf("%d��������\n", a);
	}
	if (Show(a) == 0)
	{
		printf("%d������\n", a);
	}
	system("pause");
	return 0;
}