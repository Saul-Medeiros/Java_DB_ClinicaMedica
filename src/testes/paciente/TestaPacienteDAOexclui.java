package testes.paciente;

import persistencia.PacienteDAO;

public class TestaPacienteDAOexclui {

    public static void main(String[] args) throws Exception {
        
        // String(cpf)
        System.out.println(PacienteDAO.exclui("55555555555"));
        
    }
    
}
