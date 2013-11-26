
/**
 *	注：
 *		功能：二分法搜索
 *		头文件：#include<stdlib.h>
 *		函数： void *bsearch(const void *key,const void *base,size_t nelem,size_t width,int (*fcmp)(const void *,const void *))
 *
 *	函数参数说明：
 *		参数1.  const void *key  要查找的关键字
 *		参数2.  const void *base 要查找的数组
 *		参数3.  size_t nelem     指定数组中元素的数目
 *		参数4.  size_t width	 每个元素的长度
 *		参数5.  int (*fcmp)(const void *,const void *)  指向比较函数的指针
 *
 *	函数返回值：
 *	  如果函数compare 的第一个参数小于第二个参数，返回负值；如果等于返回零值；如果大于返回正值,qsort以升序排列，函数
 *	  bsearch返回的是匹配项的指针，如果没有发现匹配项返回值为NULL
 *	    
 */ 
#include<iostream>
#include<stdlib.h>
using namespace std;

//宏定义
#define NELEM(arr) (sizeof(arr)/sizeof(arr[0]))

/**
 * 注：
 *   自定义比较函数
 *   第一个参数值>第二个参数值，返回正数；第一个参数值<第二个参数值，返回负数；两个参数值相等，返回0
 *	 升序输出
 */ 
int compare(const int *a,const int *b)
{
	return (*a-*b);
}

/**
 *	注：
 *	  使用二分查找
 */ 
int lookup(int key,int *array,int length)
{
	int *value=(int *)bsearch(&key,array,length,sizeof(int),
			(int (*)(const void *,const void *))compare);

	if(value!=NULL)
	{
		return 1;
	}
	return 0;
}

int main()
{
	int array[]={12,9,10,22,32,45};

	/**
	 * 注：
	 *   使用二分查找之前，需要先进行排序
	 */ 
	qsort(array,NELEM(array),sizeof(int),(int (*)(const void *,const void *))compare);
	for(int i=0;i<NELEM(array);i++)
	{
		cout<<array[i]<<endl;
	}

	int key;	//待查找关键字
	while(true)
	{
		cout<<"find what:";
		cin>>key;
		if(lookup(key,array,NELEM(array)))
		{
			cout<<" exsit!"<<endl;
		}
		else
		{
			cout<<"nonexsit!"<<endl;
		}
	}
}
