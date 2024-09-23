package creationaldesignnpatterns.singletonpatterndatasourcexample;

import javax.sql.DataSource;

public class DataSourceSingleton {

    private static volatile DataSource instance;

    private DataSourceSingleton() {
        // private constructor to prevent instantiation
    }

    public static DataSource getInstance() {
        if (instance == null) {
            synchronized (DataSourceSingleton.class) {
                if (instance == null) {
//                    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//                    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//                    dataSource.setUrl("jdbc:mysql://localhost:3306/yourdatabase");
//                    dataSource.setUsername("yourusername");
//                    dataSource.setPassword("yourpassword");
//                    instance = dataSource;
                }
            }
        }
        return instance;
    }
}
