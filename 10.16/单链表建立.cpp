#include<stdio.h>
#include<stdlib.h>

//������
typedef struct Node
{
	int data;
    Node *next;
}Node, *Plist;

void InitList(Plist plist)     //��ʼ��ͷ���
{
	if (plist == NULL)
	{
		return;
	}
	plist->next = NULL;
}

Node * GetNode(int val)        //�õ�һ�����  ������̬�����ڴ�
{
	Node *pGet = (Node *)malloc(sizeof(Node));
	pGet->data = val;
	pGet->next = NULL;
	return pGet;
}


void InsertTail(Plist plist, int val)
{
	Node *pcur = plist;
	Node *pGet = GetNode(val);
	while (pcur->next != NULL)
	{
		pcur = pcur->next;
	}
	pcur->next = pGet;
}

void Show(Plist plist)
{
	Node *pcur = plist->next;
	while (pcur != NULL)
	{
		printf("%d ", pcur->data);
		pcur = pcur->next;
	}
	printf("\n");
}


int main()
{
	Node head;
	InitList(&head);
	InsertTail(&head, 10);
	InsertTail(&head, 20);
	InsertTail(&head, 30);
	InsertTail(&head, 40);
	InsertTail(&head, 50);
	InsertTail(&head, 60);
	//��ӡ
	Show(&head);
	system("pause");
	return 0;
}