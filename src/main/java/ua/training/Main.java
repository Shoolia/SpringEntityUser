package ua.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.training.model.entity.User;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user",User.class);

        System.out.println("Information about user: \n" + "Name: " +  user.getName() + "\n" +"Surname: " +  user.getSurname() +
                "\n" + "Age:" + user.getAge() + "\n" + "Nickname: " +  user.getNickname());

        context.close();
    }
}