package com.practice.aop.remotes;

import org.springframework.stereotype.Repository;

//Interface Segregation Principal
@Repository
public interface ConsoleInterface {
    boolean showMenu();

}
