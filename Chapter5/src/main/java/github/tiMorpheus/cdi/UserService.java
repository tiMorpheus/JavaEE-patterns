package github.tiMorpheus.cdi;

import javax.inject.Inject;
import javax.inject.Named;

public class UserService {

    @Inject
    @Named("UserDataRepositoryMongo")
    private UserDataRepository udr;

//    public UserService(UserDataRepository udr) {
//        this.udr = udr;
//    }

    public void registrUser(User user){
        udr.save(user);
    }
}
