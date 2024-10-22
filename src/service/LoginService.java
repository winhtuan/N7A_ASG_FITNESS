package service;

import java.util.Map;
import javax.swing.JOptionPane;
import model.Login;
import reponsitory.LoginReponsitory;

public class LoginService implements ILoginService{
    private Map<String, String> mapAccout;

    public LoginService() {
        mapAccout = new LoginReponsitory().readFile();
    }
    
    @Override
    public void addAccount(Login login) {
        mapAccout.put(login.getAccount(), login.getPassword());
        new LoginReponsitory().writeFile(mapAccout);
        JOptionPane.showMessageDialog(null, "Customer added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void display() {
    }

    @Override
    public Login findByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
