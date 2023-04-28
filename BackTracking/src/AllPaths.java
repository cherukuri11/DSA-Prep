public class AllPaths {


    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        pathRestrictions("",board,0,0);
    }
    static void pathRestrictions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }


        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;

        if(r<maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }

        if(r>0){
            pathRestrictions(p+'U',maze,r-1,c);
        }
        if(c>0){
            pathRestrictions(p+'R',maze,r,c-1);
        }
        ///this line is where function will be over
        //sp before the func is removed, also remove the changes that were made by that funct

        maze[r][c]=true;
    }
}
