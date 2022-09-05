public class LeetCode_832 {
    public static void main(String[] args) {
        int[][] img= {
                {1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flip(img));
    }

    static int[][] flip(int[][] image){
        //reverse the array
        for (int[] row:image) {
            //swap and flip
            for (int i=0;i<(image[0].length+1)/2;i++){
                int temp=row[i]^1;
                row[i]= row[image[0].length-i-1]^1;  //xor to flip
                row[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}
