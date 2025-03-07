import DAO.StudentDAO;
import DAO.SuperDAO;
import DAO.TeacherDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class HiStudentRecord {
    private SuperDAO superDAO;

    public HiStudentRecord() throws IOException, SQLException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;
        while(flag){
            System.out.println("1. Hi 학생 2. Hi 선생 3. End");
            int choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    if (login(1)){
                        System.out.println("1. 학생 조회 2. 선생 조회 3. 성적 조회");
                        int choiceNum = Integer.parseInt(br.readLine());
                        switch (choiceNum){
                            case 1:
                                StudentDAO studentDAO = new StudentDAO();
                                System.out.println("조회하고 싶은 학생이름을 입력하세요.");
                                String StudentName = br.readLine();
                                SuperDAO superDAO = new StudentDAO();
                                superDAO.
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                                default:
                                    break;
                        }
                    }
                    break;
                case 2:
                    if (login(2)){

                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }

    public boolean login(int choice) throws IOException, SQLException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("아이디 비번을 입력하세요.");
        String id = br.readLine();
        String password = br.readLine();

        // 1 = 학생 로그인
        if (choice == 1){
            StudentDAO studentDAO = new StudentDAO();
            if (studentDAO.checkStudent(id, password)){
                System.out.println("로그인 완료되었습니다.");
                return true ;
            }
            System.out.println("아이디 비번이 잘못되었습니다.");
        }else if (choice == 2){    // 2 = 선생 로그인
            TeacherDAO teacherDAO = new TeacherDAO();
            if (teacherDAO.checkTeacher(id, password)){
                System.out.println("로그인 완료되었습니다.");
                return true ;
            }
            System.out.println("아이디 비번이 잘못되었습니다.");
        }else{
            System.out.println("없는 번호나 잘못된 번호를 입력하였습니다.");
        }
        return false;
    }





}
