#include<stdio.h>
#include<stdlib.h>
//1.100-200֮������
//�������Գ���   �����Ż� ������֮��������ų�ż��
int main()
{
	int i, j;
	int count = 0;
	for (i = 100; i <= 200; i++)
	{
		for (j = 2; j <= i - 1; j++)    //�Ż���for(j=2;j<=i/2;j++)
		{
			if (i%j == 0)             
			break;                     //������ǰѭ��
		}
		if (i==j)                      //һ�������������ˣ�һ����û�н��������ѭ������i=j��//�Ż���if (j>i/2) �����
       count++��
		printf("%d\n",i);
		printf("count=%d\n", count);
	}
	system("pause");
    return 0;
}

//2.�žų˷���    �Ż���ֱ��������
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


//3.�ж�����
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

