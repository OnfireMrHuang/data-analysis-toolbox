package io.github.hww.data.foundation.dao.privilege;


import io.github.hww.data.foundation.common.entities.privilege.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
