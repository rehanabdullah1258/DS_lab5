public class Ex4 {

    public static void main(String[] args) {
        circuLarLinkedList<Integer>L=new circuLarLinkedList<>();
        circuLarLinkedList<Integer>M=new circuLarLinkedList<>();
        circuLarLinkedList<Integer>K=new circuLarLinkedList<>();
        L.addFirst(11);
        L.addLast(12);

        M.addFirst(12);
        M.addLast(11);

        K.addFirst(11);
        K.addLast(11);
/////////////////////////////////////////////////////////////////////////////
        if (L.sameSequence(L,M))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list M and list L not equals" );

        if (K.sameSequence(L,K))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list K and list L not equals" );
    }
}
