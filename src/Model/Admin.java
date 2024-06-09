/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Alvan
 */
public class Admin extends User{
    
    public Admin(String email, String username, String password, String role, int id) throws Exception {
        super(email, username, password, role, id);
    }
    
}
