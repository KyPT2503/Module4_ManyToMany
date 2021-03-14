package library_manager.service.user;

import library_manager.model.User;
import library_manager.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService extends IGeneralService<User> {
    Page<User> findAll(Pageable pageable);
}
