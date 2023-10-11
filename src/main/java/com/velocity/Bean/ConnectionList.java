package com.velocity.Bean;


import javax.persistence.*;

@Entity
@Table(name = "connection")
public class ConnectionList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int connection_id;
    private String username;
    private String  connection_status;

    public int getConnection_id() {
        return connection_id;
    }

    public void setConnection_id(int connection_id) {
        this.connection_id = connection_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getConnection_status() {
        return connection_status;
    }

    public void setConnection_status(String connection_status) {
        this.connection_status = connection_status;
    }

    @Override
    public String toString() {
        return "ConnectionList{" +
                "connection_id=" + connection_id +
                ", userName='" + username + '\'' +
                ", connection_status='" + connection_status + '\'' +
                '}';
    }
}
