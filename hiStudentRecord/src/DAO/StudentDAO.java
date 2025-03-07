package DAO;

import DTO.StudentDTO;

import java.sql.*;
import java.util.*;

public class StudentDAO extends SuperDAO{
    private Connection conn;

    public StudentDAO() throws SQLException {
        this.conn = super.getConnection();
    }

    public boolean checkStudent(String id, String pwd) throws SQLException {
        String query = "select * from student";
        PreparedStatement ps = conn.prepareStatement(query);

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                if (rs.getString("id").equals(id) && rs.getString("pwd").equals(pwd)) {
                    return true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
        return false;

    }
    public void insertStudent(){

    }

}
