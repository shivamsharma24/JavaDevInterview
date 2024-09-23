package creationaldesignnpatterns.singletonpatterns.lazy;

public class DBConnectionLazy {

    private static DBConnectionLazy dbConnectionLazy;

    private DBConnectionLazy(){}

    public static DBConnectionLazy getDbConnectionLazy(){
        if(dbConnectionLazy==null){
            dbConnectionLazy=new DBConnectionLazy();
        }
        return dbConnectionLazy;
    }
}
