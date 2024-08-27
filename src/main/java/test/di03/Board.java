package test.di03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface Board {
    void insert(String data);
    void update(String data);
    void delete(String data);
    void select(String data);
}
