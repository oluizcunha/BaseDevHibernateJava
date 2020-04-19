/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import javax.swing.JOptionPane;
import src.ClienteJpaDAO;
import src.Cliente;

public class ProjetoBase {


    
    public static void main(String[] args) {
        Cliente cliente;
        cliente = ClienteJpaDAO.getInstance().getById(0);

    }
    
}
