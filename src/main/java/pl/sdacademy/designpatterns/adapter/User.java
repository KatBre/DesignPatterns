package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public interface User {
    String getFullName();

    String getUsername();

    Integer getAge();

    List<String> getRoles();

    default String toReadableString() {
        return getFullName() + " " + getUsername() + " " + getAge() + " " + getRoles();
    }
}
