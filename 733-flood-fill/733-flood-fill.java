class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
     //   boolean[][] vis=new boolean[]
          if(image.length==0){
            return image;
        }
        change(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    public void change(int[][] image,int sr, int sc, int tochange, int newColor){
        int rows = image.length;
        int columns = image[0].length;
        if(sr<0 || sr>=rows || sc<0 || sc>=columns || image[sr][sc]!=tochange || image[sr][sc]==newColor){
            return;
        }
        image[sr][sc]=newColor;
        change(image,sr+1,sc,tochange,newColor);
        change(image,sr,sc+1,tochange,newColor);
        change(image,sr-1,sc,tochange,newColor);
        change(image,sr,sc-1,tochange,newColor);
    }
    
}