package dio.web.api.repository;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import dio.web.api.handler.BusinessException;
import dio.web.api.model.User;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getLogin() == null){
            throw new BusinessException("O campo login é obrigatório!");
        }
        if(user.getId() == null){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
        System.out.println(user);
        }
    }
    public void update(User user){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("gleyson","password"));
        users.add(new User("frank","masterpass"));
        return users;
    }
    public User findByUsername(String username){
        System.out.println("FIND/username - Recebendo o username para localizar um usuário");
        return new User("gleyson","password");
    }
}
