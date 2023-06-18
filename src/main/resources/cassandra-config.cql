CREATE KEYSPACE my_keyspace WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'};

USE my_keyspace;

CREATE TABLE users (
                       username TEXT PRIMARY KEY,
                       name TEXT,
                       follower_count INT
);