package DAO;


import java.sql.*;

public class TeacherDAO extends SuperDAO{
    private Connection conn;

    public TeacherDAO() throws SQLException {
        this.conn = super.getConnection();
    }
    public boolean checkTeacher(String id, String pwd) throws SQLException {
        String query = "select * from teacher";
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

}
