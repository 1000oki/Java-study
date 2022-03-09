import java.util.LinkedList;
import java.util.ListIterator;

class ListTest {
    public static void main(String[] args)
    {
        LinkedList<String> friends = new LinkedList<String>();

        friends.addLast("Kim");
        friends.addLast("Lee");
        friends.addLast("Park");
        friends.addLast("Yoon");
        System.out.println(friends);

        ListIterator<String> iterator = friends.listIterator();
        iterator.next();
        iterator.next();

        iterator.add("Im");
        iterator.add("Dong");

        iterator.next();
        iterator.next();

        iterator.remove();

        System.out.println(friends);
    }    
}
