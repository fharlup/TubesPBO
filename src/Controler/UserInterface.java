/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.User;
import java.util.List;

/**
 *
 * @author Alvan
 */
public interface UserInterface {
    public List<User> getAll();
    public User getById(int id);
}
