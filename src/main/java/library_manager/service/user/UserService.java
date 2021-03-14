package library_manager.service.user;

import library_manager.model.User;
import library_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User update(long id, User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean remove(long id) {
        try {
            userRepository.delete(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
