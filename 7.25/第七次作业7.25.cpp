//#define _CRT_SECURE_NO_WARNINGS 1
//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//1.�ݹ�ͷǵݹ�ֱ�ʵ�����n��쳲���������
//�ٵݹ麯��
//int Feibo(int n)
//{
//	if (n <= 0)
//	{
//		return 0;
//	}
//	if ((n == 1) || (n == 2))
//	{
//		return 1;
//	}
//	else
//	{
//		return Feibo(n - 1) + Feibo(n - 2);
//	}
//}
//
//int Feibo(int n)
//{ 
//	if (n <= 0)
//	{
//		return 0;
//	}
//	if ((n == 1) || (n == 2))
//	{
//		return 1;
//	}
//	int num1 = 1;
//	int num2 = 1;
//	int num = 0;
//	int i = 0;
//	for (i = 3; i <= n; i++)
//	{
//		num = num1 + num2;
//		num1 = num2;
//		num2 = num;
//	}
//	return num2;
//}
//
//int main()
//{
//	int n = 0;
//	printf("��Ҫ��ڼ���쳲���������", n);
//	scanf("%d", &n);
//	int k=Feibo(n);
//	printf("%d\n", k);
//	 system("pause");
//	 return 0;
//}
//
//2.��дһ������ʵ��n^k��ʹ�õݹ�ʵ��
//int  Show(int n, int k)
//{
//	if (k == 1)
//	{
//		return n;
//	}
//	else if (k==0)
//	{
//		return 1;
//	}
//	else
//	{
//		return n* Show(n, k - 1);
//	}
//}
//
//
//int main()
//{
//	int i = 0;
//	int k = 0;
//	printf("������������ݣ�", i, k);
//	scanf("%d %d",&i, &k);
//	int ret=Show(i, k);
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}
//
//
//3. дһ���ݹ麯��DigitSum(n)������һ���Ǹ����������������������֮�ͣ����磬����DigitSum(1729)����Ӧ�÷���1 + 7 + 2 + 9�����ĺ���19
//int DigitSum(int n)
//{
//	if (n <= 9)
//	{
//		return n%10;
//	}
//	else
//	{
//		return DigitSum(n / 10) + (n % 10);
//	}
//}
//
//int main()
//{
//	int i = 0;
//	scanf("%d", &i);
//	int ret=DigitSum(i);
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}
//
//4. ��дһ������ reverse_string(char * string)���ݹ�ʵ�֣�ʵ�֣��������ַ����е��ַ��������С�Ҫ�󣺲���ʹ��C�������е��ַ�������������
//
//char *Reverse_string(char *string)
//{
//	int n = 0;
//	while (*string != '\0')
//	{
//		n++;
//		*string++;
//		
//	}
//	if (n > 1)
//	{
//		char tmp = string[0];
//		string[0] = string[n - 1];
//		string[n - 1] = tmp;
//		Reverse_string(string + 1);
//		
//	}
//	return string;
//
//}
//
//int main()
//{
//	char *arr[] = { "asdfg" };
//	char *k=Reverse_string(*arr);
//	printf("%c\n", *k);
//	system("pause");
//	return 0;
//}
//
//
//
//
//5.�ݹ�ͷǵݹ�ֱ�ʵ��strlen
//�ٷǵݹ麯��
//int Cal(char *arr)
//{
//	int count = 0;
//	while (*arr!='\0')
//	{
//		count++;
//		*arr++;
//	}
//	return count;
//}
//
//�ڵݹ麯��
//int Cal(char *arr)
//{
//	if (*arr != '\0')
//	{
//	   return 1+Cal(arr+1);
//    }
//	else
//	{
//		return 0;
//	}
//}
//
//int main()
//{
//	char arr[] = "qweeui2rttyui";
//	int ret = Cal(arr);
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}
//
//
//
//6.�ݹ�ͷǵݹ�ֱ�ʵ����n�Ľ׳�
//�ٷǵݹ麯��
//int Show(int n)
//{
//	int mul = 1;
//	while(n > 1)
//	{
//		mul = mul*n;
//		n--;
//	}
//	return mul;
//}
//�ڵݹ麯��
//int Show(int n)
//{
//	if(n > 1)
//	{
//		return n*Show(n - 1);
//	}
//	else
//	{
//		return 1;
//	}
//}
//
//
//int main()
//{
//	int i = 0;
//	printf("������n��", i);
//	scanf("%d", &i);
//	int mul=Show(i);
//	printf("%d\n", mul);
//	system("pause");
//	return 0;
//}
//
//
//
//
//7.�ݹ鷽ʽʵ�ִ�ӡһ��������ÿһλ
//void Show(int n)
//{
//	if (n <= 9)
//	{
//		printf("%d ",n % 10);
//	}
//	else
//	{
//	    Show(n / 10);
//		printf("%d ", n % 10);
//	}
//}
//
//int main()
//{
//	int i = 0;
//	scanf("%d", &i);
//	Show(i);
//	system("pause");
//	return 0;
//}
//
//
