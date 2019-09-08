package edu.cursor.service;

import javax.inject.Singleton;

@Singleton
public class GoodbyeService {

    public String sayGoodbye() {
        return ", sorry the server is busy now, please, try again later, goodbye!";
    }

}