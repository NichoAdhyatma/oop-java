package Lt1;

class Over extends Base{
    public static void main(String argv[]){
        Over o = new Over();
        int iBase=0;
        o.amethod(iBase);
    }
    public void amethod(int iOver){
        System.out.println("Over.amethod");
    }
}