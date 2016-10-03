package github.tiMorpheus.cdi;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

@Alternative
@Named("UserDataRepositoryМongo")
public class UserDataRepositoryMongo implements UserDataRepository {


    public void save(User user) {

    }
}
