#include <stdio.h>
void main()
{
	int n=5,i,j,k;
	printf("hi");
	for(i=0;i<n;i++)
	{
		for(j=0;j<=n;j++)
		{
			for (k=j;k<=n;k++)
			{
				printf("%d",k);
			}
		}
		printf("\n");
	}
}
