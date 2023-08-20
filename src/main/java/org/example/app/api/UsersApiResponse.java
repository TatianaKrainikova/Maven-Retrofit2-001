package org.example.app.api;

import org.example.app.model.User;

import java.util.List;

public class UsersApiResponse {

    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UsersApiResponse{" +
                "data=" + data +
                '}';
    }
}
