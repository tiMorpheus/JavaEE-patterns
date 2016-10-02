package github.tiMorpheus.cdi;

public class UserService {

    private UserDataRepository udr;

    public UserService(UserDataRepository udr) {
        this.udr = udr;
    }

    public void registrUser(User user){
        udr.save(user);
    }
}
