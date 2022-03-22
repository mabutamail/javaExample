екффpackage com.github.mabutamail.javatemplate.actual.treeMapTempl;

import com.github.mabutamail.javatemplate.core.timeToLive.Query;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class TreeMapExample {
    public static void main(String[] args) throws InterruptedException {
        //  put get remove
        TreeMap<Integer, Query> messagesToFront_ = new TreeMap<>();

        Query query1 = new Query("query1");
//        TimeUnit.SECONDS.sleep(1);
        Query query2 = new Query("query2");
//        TimeUnit.SECONDS.sleep(1);
        Query query3 = new Query("query3");

        messagesToFront_.put(41, query1);
        messagesToFront_.put(21, query2);
        messagesToFront_.put(33, query3);
        System.out.println("в мапе это " + messagesToFront_);

        for (Iterator<Map.Entry<Integer, Query>> it = messagesToFront_.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Query> entry = it.next();
            it.remove();
        }

        System.out.println("после удаления в мапе это " + messagesToFront_);

//        System.out.println(messagesToFront_.get(33));

//        messagesToFront_.remove(21);

//        System.out.println(messagesToFront_);
    }

}