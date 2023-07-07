//Convert 1D array into 2D


class TwoDArray

{

    public static void main(String args[])

    {

    int a[][]=new int[3][3];

    int d[]={10,20,30,40,50,60,70,80,90};



    int count=0;

        for(int i=0;i<4;i++)

        {

            for(int j=0;j<3;j++)

            {

                if(count==d.length) break;

            a[i][j]=d[count];

            System.out.printf("a[%d][%d]= %d\n",i,j,a[i][j]);

            count++;

            }

        }



    System.out.println("Count is "+count);

    }

}