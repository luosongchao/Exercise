#include<stdlib.h>
#include<stdio.h>
void display();

int main(char *arg[],int count)


{
	char *argv[]={"luo","song","chao"};
	int i=0;
	for(;i<3;i++)
	{
		printf("%s\t",argv[i]);
	}
	
	printf("\n");
	printf("%s\n",argv[0]);
	printf("%c\n",argv[0][2]);
	printf("%s\n",*(argv+1));
	printf("%c\n",*(*(argv+2)+1));
	char string[]="helloworld";
	printf("%s,%c\n",string,*(string+1));
	display();
}

void display()
{
	printf("helloworld");
}
