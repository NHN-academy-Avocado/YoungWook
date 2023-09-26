package 연습2;

public class TestList {
    public static ListNode create() {
        ListNode a = new ListNode("A");
        ListNode b = new ListNode("B");
        ListNode c = new ListNode("C");

        a.next = b;
        b.next = c;
        c.next = null;
        return a;
    }

    //모든 메소드는 재귀로 다시 푼다
    public static int length(ListNode lis) {
        if (lis == null) {
            return 0;
        }

        return 1 + length(lis.next);
    }

    public static ListNode insertAfter(ListNode lis, String s, String been) {
        if (lis == null) {
            return null;
        }

        if (lis.info.equals(been)) {
            ListNode p = new ListNode(s);
            p.next = lis.next;
            lis.next = p;
        } else {
            lis.next = insertAfter(lis.next, s, been);
        }

        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        if (lis == null) {
            return null;
        }

        if (lis.info.equals(old)) {
            lis.info = ne;
        }

        lis.next = modify(lis.next, old, ne);
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        if (lis == null) {
            return null;
        }

        if (lis.info.equals(old)) {
            lis.info = ne;
        }

        lis.next = modifyAll(lis.next, old, ne);
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        if (lis == null) {
            return null;
        }

        if (lis.info.equals(given)) {
            ListNode p = new ListNode(s);
            p.next = lis;
            return p;
        }

        lis.next = insertBefore(lis.next, s, given);
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return null;
        }

        ListNode newNode = new ListNode(lis.info);
        newNode.next = copy(lis.next);
        return newNode;
    }

    public static ListNode invert(ListNode lis) {
        if (lis == null || lis.next == null) {
            return lis;
        }

        ListNode reversed = invert(lis.next);
        lis.next.next = lis;
        lis.next = null;
        return reversed;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null || lis.next == null) {
            return lis;
        }

        lis.next = deleteDoubles(lis.next);

        if (lis.info.equals(lis.next.info)) {
            return lis.next;
        } else {
            return lis;
        }
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        if (lis1 == null) {
            return false;
        }

        if (startsWith(lis1, lis2)) {
            return true;
        }

        return searchSequence(lis1.next, lis2);
    }

    private static boolean startsWith(ListNode lis1, ListNode lis2) {
        if (lis2 == null) {
            return true;
        }

        if (lis1 == null || !lis1.info.equals(lis2.info)) {
            return false;
        }

        return startsWith(lis1.next, lis2.next);
    }

}
