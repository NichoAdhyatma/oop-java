package Lt2;

class MyParent {
    int x, y;
    MyParent(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int addMe(int x, int y){
        return this.x + x + y + this.y;
    }
    public int addMe(MyParent myPar){
        return addMe(myPar.x, myPar.y);
    }
}