#include<iostream>
#include<stdlib.h>
#include<cstring>
#include<stdio.h>
using namespace std;

/**
 * 定义字典元素的结构体
 */ 
typedef struct 
{
	char chinese[32];
	char english[32];
}dictionary;

dictionary dict[1024];

//头文件
void InputDic(int length);
char *GetDic(char *str,int length);
void SortDic(int length);
int CompareSort(const void *a,const void *b);
int CompareSer(const void *a,const void *b);

int main()
{
	bool flag=true;	//标示辞典词库更新完成
	int length=0;
	char str[32];

	cout<<"END结束字典录入..."<<endl;
	cout<<"输入中文对应的英文，程序将对英文进行排序查找对应中文...."<<endl;

	while(true)
	{
		cin>>str;

		if(flag)
		{
			if(strcmp(str,"END")==0)
			{
				SortDic(length);	//排序辞典
				flag=false;
				cout<<"字典录入完成，即将开始用户查找....\n";
				cout<<"\t查找：";
			}
			else
			{
				InputDic(length); //填充词库
				length++;
			}
		}
		else
		{
			char *result=GetDic(str,length); //查找辞典
			cout<<"查找结果："<<result<<endl;
			cout<<"\t查找：";
		}
	}

	return 0;
}

/**
 * 填充词库，词库中包括中文和英文，通过英文排序
 */ 
void InputDic(int length)
{
	cout<<"\t输入中文：";
	cin>>dict[length].chinese;	

	cout<<"\t输入英文：";
	cin>>dict[length].english;
}

/**
 *	辞典按照英文排序的比较函数
 */ 
int CompareSort(const void *a,const void *b)
{
	return strcmp(((dictionary *)a)->english,((dictionary *)b)->english);
}

/**
 *	使用qsort快速排序，更新辞典
 */ 
void SortDic(int length)
{
	qsort(dict,length,sizeof(dictionary),CompareSort);
}

/**
 * 二分查找的比较函数，按照英文查找中文
 */ 
int CompareSer(const void *a,const void *b)
{
	return strcmp((char *)a,((dictionary *)b)->english);
}

/**
 * 查找辞典，返回查找结果，未查找到返回“eh”
 */ 
char *GetDic(char *str,int length)
{
	dictionary *result=(dictionary  *)bsearch(str,dict,length,sizeof(dictionary),CompareSer);	//排序后的辞典，二分查找
	char *value=NULL;

	if(result==NULL)
	{
		value=(char *)"eh";
	}
	else
	{
		value=result->chinese;
	}

	return value;
}
