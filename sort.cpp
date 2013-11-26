
/**
 * 注：
 *      功能：  排序
 *      头文件: #include<algorithm>
 *      函数：sort(void *base,void *end,[bool (*fcmp)(void *,void *)])
 *
 *      函数说明：
 *            参数1. 待排序数组首地址
 *            参数2. 待排序数组尾地址
 *            参数3. 确定排序顺序
 *		函数返回值:
 *		      确定排序顺序的函数，第一个参与第二参数比较，为正时降序排列
 *		      为负时升序排列
 */ 
#include<iostream>
#include<algorithm>
using namespace std;

/**
 * 注：
 *     升序排列，a<b为真
 */ 
bool aesc(char a,char b)
{
	return a<b;
}

/**
 * 注：
 *    降序排列，a>b为真
 */ 
bool desc(char a,char b)
{
	return a>b;
}

/**
 * 注：
 *		降序输出
 */ 
bool compare_down(int a,int b)
{
	return a>b;
}

/**
 * 注：
 *   升序输出
 */ 
bool compare_up(int a,int b)
{
	return a<b;
}

int main()
{
	string s="acebdfgzik";
	cout<<s<<endl;
	int length=s.length();


	/**
	 * 注：
	 *    使用STL中的sort函数(需要包含#include<algorithm>)，参数为对象地址，默认为升序排列
	 *    可以自定义排序方式
	 */ 
	sort(&s[0],&s[length],desc);
	cout<<"desc:"<<s<<endl;

	sort(&s[0],&s[length]);
	cout<<"default:"<<s<<endl;

	sort(&s[0],&s[length],aesc);
	cout<<"aesc:"<<s<<endl;

	int array[]={12,4,23,45,11,8};
	int size=sizeof(array)/sizeof(array[0]);
	cout<<"size:"<<size<<endl;

	sort(array,array+size,compare_down);
	for(int i=0;i<size;i++)
	{
		cout<<array[i]<<endl;
	}

	cout<<"============="<<endl;
	sort(array,array+size);
	for(int i=0;i<size;i++)
	{
		cout<<array[i]<<endl;
	}
	return 0;
}
