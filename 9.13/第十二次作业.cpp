#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

//1.��д������
//unsigned int reverse_bit(unsigned int value);
//��������ķ���ֵ��value�Ķ�����λģʽ�����ҷ�ת���ֵ��
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
//	printf("������һ����:", i);
//	scanf("%d", &i);
//	unsigned int b = reverse_bit(i);
//	printf("%u\n", b);
//	system("pause");
//	return 0;
//}




//2.��ʹ�ã�a + b�� / 2���ַ�ʽ������������ƽ��ֵ��



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



//��������&��^����
//int Avg(int a, int b)
//{
//	int avg = 0;
//	avg = (a&b) + (a^b) >> 1;  //����һλ�����2������һλ�����2
//	return avg;
//}
//
//int main()
//{
//	printf("%d\n", Avg(10, 20));
//	system("pause");
//	return 0;
//}


//3.���ʵ�֣�һ��������ֻ��һ�����ֳ�����һ�Ρ������������ֶ��ǳɶԳ��ֵġ����ҳ�������֡���ʹ��λ���㣩

//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };         //1 3 5 2 1 3 5 7��������ͬ��Ӧ����ô���أ���2��7���ֵ���������
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
//��һ���ַ����������Ϊ:"student a am i",
//			���㽫��������ݸ�Ϊ"i am a student".
//			Ҫ��
//			����ʹ�ÿ⺯����
//			ֻ�ܿ������޸��ռ䣨�ռ�������ַ����ĳ����޹أ���

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


