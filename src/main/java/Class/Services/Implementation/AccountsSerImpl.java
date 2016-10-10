package Class.Services.Implementation;

import Class.Entity.Accounts;
import Class.Repository.AccountsRepo;
import Class.Services.AccountsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsSerImpl implements AccountsSer {
    @Autowired
    private AccountsRepo accountsRepo;

    @Override
    public void addOrEdit(Accounts accounts) {
        accountsRepo.save(accounts);
    }

    @Override
    public void delete(int id) {
        accountsRepo.delete(id);
    }

    @Override
    public Accounts findOneById(int id) {
        return accountsRepo.findOne(id);
    }

    @Override
    public List<Accounts> findAll() {
        return accountsRepo.findAll();
    }
}
