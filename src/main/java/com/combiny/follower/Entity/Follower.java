package com.combiny.follower.Entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("followers")
public class Follower {
    @PrimaryKey
    private String followerId;

    @Column
    private String username;
}