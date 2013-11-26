
/**
 *	说明：
 *	   qsort(void *base,int nelem,int width,int (*func)(const void *,const void *))
 *	   功能：使用快速排序进行排序
 *	   头文件：#include<stdlib.h>
 *
 *  函数说明：
 *     参数1. void *base 待排序数组首地址
 *     参数2. int  nelem 待排序元素数量
 *     参数3. int  width 各元素占用空间
 *	   参数4. int (*func)(const void *,const void *) 指向函数的指针，用于确定排序的顺序
 */ 
#include<iostream>
#include<stdlib.h>
#include<cstring>
using namespace std;

/**
 * 注：
 *     定义qsort的比较函数
 */ 
int compare(const void *a,const void *b)
{
	if(strlen((char *)a)!=strlen((char *)b))
	{
		return  strlen((char *)a)-strlen((char *)b);
	}
	return strcmp((char *)a,(char *)b);
}

/**
 * 注：
 *   qsort比较函数
 */ 
int compare2(const void *a,const void *b)
{
	return strcmp((char *)a,(char *)b);
}

int main()
{
	char s[8][10]={"January","February","March","April","May","June","July","August"};
	qsort(s,8,sizeof(char)*10,compare2);
	for(int i=0;i<8;i++)
	{
		cout<<s[i]<<endl;
	}
	return 0;
}


