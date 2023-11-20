import builder.LocalityBuilder;
import locality.Locality;
import observer.ColdObserver;
import observer.HotObserver;
import observer.IObserver;
import singletonNotifier.LocalitySingletonNotifier;

import java.sql.*;

public class LauncherApp {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/esercizioweather?serverTimezone=UTC";
        String user = "root";
        String pwd = "3306";

        try{
            Connection connection = DriverManager.getConnection(url, user, pwd);

            // check connection
            //System.out.println(connection);

            // insert
//        PreparedStatement insertPs = connection.prepareStatement("INSERT INTO locality(id, name, lat, longi, temperature, humidity) VALUES(?, ?, ?, ?, ?, ?)");
//        insertPs.setInt(1, 4 );
//        insertPs.setString(2,"Milan");
//        insertPs.setInt(3,56);
//        insertPs.setInt(4,49);
//        insertPs.setInt(5,2);
//        insertPs.setInt(6,439);
//        insertPs.executeUpdate();


            PreparedStatement statement = connection.prepareStatement("SELECT * FROM locality WHERE name = (?)");
            statement.setString(1,"Rome");
            ResultSet rs = statement.executeQuery();

            LocalityBuilder builder = new LocalityBuilder();
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int lat = rs.getInt("lat");
                int longi = rs.getInt("longi");
                int temperature = rs.getInt("temperature");
                int humidity = rs.getInt("humidity");

                Locality myLocality = builder.getTemp(temperature).getHumidity(humidity).build();
                myLocality.toString();

                IObserver hotObserver = new HotObserver();
                IObserver coldObserver = new ColdObserver();
                LocalitySingletonNotifier.getInstance().subscribe(hotObserver);
                LocalitySingletonNotifier.getInstance().subscribe(coldObserver);
                LocalitySingletonNotifier.getInstance().setFinalTemperature(temperature);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
