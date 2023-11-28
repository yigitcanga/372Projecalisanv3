package org.proje.jdbc.dao;

import org.proje.jdbc.model.Ders;
import org.proje.jdbc.model.Veli;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VeliDAO extends DAO{

    public VeliDAO() throws Exception {
    }

    public Veli rowToVeli(ResultSet resultSet) throws Exception{
        Veli veli = new Veli();
        veli.setAd(resultSet.getString("ad"));
        veli.setMail(resultSet.getString("mail"));
        veli.setSoyad(resultSet.getString("soyad"));
        veli.setOkulNo(resultSet.getString("okul_no"));
        veli.setTelNo(resultSet.getString("tel_no"));
        return veli;
    }

    public List<Veli> getAllVeli() throws Exception {

        List<Veli> list = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;

        try {

            statement = super.con.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM veli");

            while (resultSet.next()){
                Veli veli = rowToVeli(resultSet);
                list.add(veli);

            }

        } catch (Exception e) {
            throw new Exception(e);
        }

        return  list;
    }
}
