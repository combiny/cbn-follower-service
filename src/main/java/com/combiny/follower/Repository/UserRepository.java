package com.combiny.follower.Repository;

import com.combiny.follower.Entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
    // Özel sorguları burada tanımlayabilirsiniz
}