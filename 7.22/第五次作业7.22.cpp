#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
//1.��ɲ�������Ϸ��
//int main()
//{
//	int i = 0;
//	int a = 0;
//	srand(time(0));                             
//	i = rand() % 100 + 1;                      //����һ���������,����1-100�������
//	printf("*****������Ϸ��ʼ*****\n");
//	loop: printf("��²�����ǣ�", a);
//	scanf("%d", &a);
//	while (a!=i)
//	{
//		if (a < i)
//		{
//			printf("������Ĳ�һ�°ɣ�\n", a);
//			goto loop;
//		}
//		else
//		{
//			printf("����С�Ĳ�һ�°ɣ�\n", a);
//			goto loop;
//		}			
//	 }
//	printf("��������ϲ�����ڲ¶��ˣ�!\n");
//  system("pause");
//	return 0;
//}


//2.д����������������������в�����Ҫ�����֣��ҵ��˷����±꣬�Ҳ������� - 1.���۰���ң�
//int main()
//{
//	int j = 0;
//	int low = 0;
//	int high = 0;
//	int arr[10] = { 3, 4, 12, 14, 23, 24, 56, 78, 89, 98 };
//	high = (sizeof(arr) / sizeof(arr[0]))-1;
//	printf("��������Ҫ���ҵ�����",j);
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
//			printf("�ҵ��ˣ��±�Ϊ��%d\n", mid);
//			break;
//		}
//	}
//	if (low > high)
//	{
//		return -1;
//	}
//	system("pause");
//}


//��ʦд��
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







//3.��д����ģ��������������ĳ���������������������룬������ȷ����ʾ����¼�ɹ���, �������
//�����������룬����������Ρ����ξ�������ʾ�˳�����
//int main()
//{
//	
//	char arr[4] = { 0 };
//	int i = 0;
//	for (i = 1; i < 4;i++)
//	{
//		printf("���������룺");
//		scanf("%s", arr);
//		if (0==strcmp(arr,"226"))
//		{
//			printf("��¼�ɹ���\n");
//			break;
//		}
//		else
//		{
//			printf("�������!\n");
//		}
//	 }
//	if (i == 4)
//	{
//		return -1;
//	}
//	system("pause");
//}



//4.��дһ�����򣬿���һֱ���ռ����ַ��������Сд�ַ��������Ӧ�Ĵ�д�ַ���
//������յ��Ǵ�д�ַ����������Ӧ��Сд�ַ�����������ֲ������123ABCD45efG == > abcdEFg

int main()
{
	int i = 0;
	printf("�������ַ���", i);
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
