package com.demo.services;

import com.demo.vo.Agency;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class AgencyService {

    public ArrayList getAgencies() {
        ArrayList<Agency> agencies=new ArrayList();

        Map result = new HashMap();
        result.put("1", "Agency1");
        result.put("2", "Agency2");
        result.put("3", "Agency3");
        result.put("4", "Agency4");
        result.put("5", "Agency5");
        return agencies;
    }
}






//try {
//            Class.forName("org.gjt.mm.mysql.Driver");
//            String loadQuery = "LOAD DATA LOCAL INFILE '" + "agency.csv" + "' INTO TABLE spring.agency FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n' (agency_id, name)";
//            String selectQuery = "SELECT * FROM spring.agency";
//            Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.26:3306/test","root","root");
//
//            Statement statement = connection.createStatement();
//            statement.execute(loadQuery);
//
//            ResultSet resultSet=statement.executeQuery(selectQuery);
//            while(resultSet.next()){
//                Agency agency = new Agency();
//                agency.setAgency_id(resultSet.getInt("agency_id"));
//                agency.setName(resultSet.getString("name"));
//                agenciesList.add(agency);
//            }
//            connection.close();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }