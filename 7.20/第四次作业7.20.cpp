#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<math.h>

//1.��ӡ0-999999��ˮ�ɻ���
//count���������������ֵ�λ��
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


//2.��Sn = a + aa + aaa + aaaa + aaaaa��ǰn��֮�ͣ�����a��һ������
//int main()
//{
//	int n = 0;
//	int a = 0;                          
//	int sum = 0;
//	int count = 0;                      //count���������ӵ��ڼ�λ
//	int tmp = 0;
//	printf("������a��ֵ��", a);
//	scanf("%d", &a);
//	printf("��Ҫ����ǰ����֮�ͣ�", n);
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
//��һ��
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
	printf("��Ҫ��ǰ����֮�ͣ�");
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
