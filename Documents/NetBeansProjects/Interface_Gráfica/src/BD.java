
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {
    public static void main(String[] args){
        try {
            String banco = "jdbc:mysql://localhost/agenda telefônica";
            String usuario = "root";
            String senha = "1234";
            Connection conexão = DriverManager.getConnection(banco, usuario, senha);
            Statement comando = conexão.createStatement();
            
            //inserir
           // comando.execute("insert into usuário(login, senha) values('Breno','123')");
            //deletar
            // comando.execute("delete from usuário where codigo_usuario = 1");
            //operar
            // comando.execute("update usuário set login = 'Vasco' where codigo_usuario = 2 ");
            //consultar
               /*ResultSet  resultado = comando.executeQuery("select * from usuário");
               while(resultado.next()){
                   System.out.println("Login: " +resultado.getString("login"));
                     System.out.println("Senha: " +resultado.getString("senha"));
            }
                 */  
        
       }catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
    }
}
