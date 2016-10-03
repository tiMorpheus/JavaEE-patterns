package github.tiMorpheus.cdi;

public class UserServiceFactory {

    public UserService getInstance(){
        return new UserService();
    }
}
