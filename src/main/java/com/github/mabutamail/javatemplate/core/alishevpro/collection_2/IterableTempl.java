package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class IterableTempl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(56);
        list.add(1);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;

        while (iterator.hasNext()) {
            log.info("iterator.next() " + iterator.next());
            if (idx == 2) {
                iterator.remove();
            }
            idx++;
        }

        log.info("list to string " + list);

        for (int i : list) {
            log.info("foreach " + i);
//            list.remove(1);
        }
    }
}