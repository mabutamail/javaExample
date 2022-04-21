package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

@Slf4j
public class QueueTempl {
    public static void main(String[] args) {
        PersonQ person1 = new PersonQ(1);
        PersonQ person2 = new PersonQ(2);
        PersonQ person3 = new PersonQ(3);
        PersonQ person4 = new PersonQ(4);

        Queue<PersonQ> people = new ArrayBlockingQueue<>(3);
//        Queue<PersonQ> people = new LinkedList<>();
//        log.info("" + people.add(person3));
//        log.info("" + people.add(person2));
//        log.info("" + people.add(person4));
//        log.info("" + people.add(person1));

        log.info("" + people.offer(person3));
        log.info("" + people.offer(person2));
        log.info("" + people.offer(person4));
        log.info("" + people.offer(person1));

        log.info("" + people);
        log.info("remove() " + people.remove());
        log.info("peek() " + people.peek());

        for (PersonQ person : people) {
            log.info(" " + person);
        }

    }
}

class PersonQ {
    int id;

    public PersonQ(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonQ{" +
                "id=" + id +
                '}';
    }
}