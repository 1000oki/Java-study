class HomeWork1 
{
	public static void main (String args[])
    {
        int height;         
        int width;         
        int center;        
        int top;         
        int bottom;      
        
        height = 7;         
        width = 15;         
        center = width / 2; 

        char[][] ship = new char[height][width];   

        top = height / 2;
        bottom = top*2;

        int start; 
        int end;   

        start = center;
        end = center;
        for(int a = 0 ; a < top ; a++){
            for(int b = 0; b < width; b++){
                if(start<=b && b<=end){
                    ship[a][b] = '*';
                    System.out.print(ship[a][b]);
                }else {
                    ship[a][b] = ' ';
                    System.out.print(ship[a][b]);
                }
            }
            start--;
            end++;
            System.out.println();
        }

               start = 0;
        end = width - 1;
        for(int a = top; a < bottom; a++){
            for(int b = 0; b < width; b++){
                if(start <=b && b<= end){
                    ship[a][b] = '*';
                    System.out.print(ship[a][b]);
                }else{
                    ship[a][b] = ' ';
                    System.out.print(ship[a][b]);
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }
}
