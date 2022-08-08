package nqt_Training;

public class Pattern {

	public static void main(String[] args) {
		int n = 4;
		
		for(int i = 0;i<=(n*2-1)/2;i++) {
			for(int j = 0;j<n*2-1;j++) {
				if(j==0 || j==n*2-2)
					System.out.print(n);
				else
					System.out.print(n-i);
			}
			System.out.println();
		}

	}

}

/*
 * 
  #include<stdio.h>
int min(int a,int b,int c,int d)
{
    int e,f;
    e=a<b?a:b;
    f=c<d?c:d;
    return e<f?e:f;
}
int main()
{
    int n,i,j,x;
    scanf("%d",&n);
    for(i=0;i<(2*n)-1;i++,printf("\n"))
    for(j=0;j<2*n-1;j++)
    {
        x=min(i,j,(2*n-2)-i,(2*n-2)-j);
        printf("%02d ",n-x);
    }
}

 * */
