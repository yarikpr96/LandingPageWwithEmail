package Class.Services;

import Class.Entity.Accounts;

import java.util.List;

/**
 * Created by Ярослав on 08.10.2016.
 */
public interface AccountsSer {
    void addOrEdit(Accounts customer);
    void delete(int id);
    Accounts findOneById(int id);
    List<Accounts> findAll();
}
