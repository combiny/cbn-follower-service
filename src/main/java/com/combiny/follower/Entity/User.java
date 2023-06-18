package com.combiny.follower.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("users")
public class User {
    @PrimaryKey
    private String username;

    @Column
    private String name;

    @Column("follower_count")
    private int followerCount;
}
