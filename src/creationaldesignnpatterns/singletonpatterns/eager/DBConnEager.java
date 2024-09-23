package creationaldesignnpatterns.singletonpatterns.eager;

public class DBConnEager {
    private static final DBConnEager connEager= new DBConnEager();

    private DBConnEager(){

    }

    public static DBConnEager getConnEager(){
        return connEager;
    }

    public static void main(String[] args) {
        DBConnEager connObj = DBConnEager.getConnEager();
    }
}
