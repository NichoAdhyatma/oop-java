package Lt2;

class MyChild extends MyParent{
    int z;
    MyChild (int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    public int addMe(int x, int y, int z){
        return this.x + x + this.y + y + this.z + z;
    }
    public int addMe(MyChild myChi){
        return addMe(myChi.x, myChi.y, myChi.z);
    }
    public int addMe(int x, int y){
        return this.x + x + this.y + y;
    }
}