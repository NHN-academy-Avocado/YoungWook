package 연습1;


import java.io.PrintStream;

public class TestList {
    public static void main(String[] args) {
        ListNode ls = create();
        System.out.println("Total length: " + length(ls));
//        ls = insertAfter(create(), "s", "A");
//        print(ls, System.out);
//        modifyAll(ls, "B", "S");
//        print(ls, System.out);

//        insertBefore(ls, "X", "Q");
//        print(ls,System.out);


//        System.out.println("Origin Node: ");
//        print(ls, System.out);
//        System.out.println("Copy Node: ");
//        print(copy(ls), System.out);

//        print(ls, System.out);
//        print(invert(ls), System.out);

//        print(ls, System.out);
//        print(deleteDoubles(ls), System.out);


    }

    public static void print(ListNode lis, PrintStream ps) { //노드 확인용 메서드
        ListNode p = lis;
        while (p != null) {
            ps.print(p.info + " ");
            p = p.next;
        }
        ps.println();
    }

    public static ListNode create() {
        ListNode a = new ListNode("A");
        ListNode b = new ListNode("B");
        ListNode c = new ListNode("C");
        ListNode d = new ListNode("Q");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    public static int length(ListNode lis) {
        int count = 0;
        if (lis == null) {
            return 0;
        }
        while (lis != null) {
            if (lis.info != null) {
                count++;
                lis = lis.next;
            }

        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String been) {
        //주어진 요소 뒤에 새 요소 s를 삽입하여 lis를
        //수정하여 얻은 목록을 반환하고 , 그렇지 않으면 수정되지 않은 lis를 반환합니다.
        ListNode first = lis;
        while (lis != null) {
            if (lis.info.equals(been)) {
                ListNode p = new ListNode(s);
                p.next = lis.next;
                lis.next = p;
                break;
            }
            lis = lis.next;
        }

        return first;
    }


    public static ListNode modify(ListNode lis, String old, String ne) {
        //old 의 첫 번째 발생을 ne 로 변경하여 lis를
        //수정하여 얻은 목록을 반환합니다 .
        ListNode first = lis;
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
                break;
            }
            lis = lis.next;
        }

        return first;

    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        //old 의 모든 항목을 ne 로 변경하여 lis를
        //수정하여 얻은 목록을 반환합니다 .
        ListNode first = lis;
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
            }
            lis = lis.next;
        }

        return first;

    }


    public static ListNode insertBefore(ListNode lis, String s, String given) {
        //요소 앞에 새 요소 s를 삽입하여 lis를
        //수정하여 얻은 목록을 반환하고 , 그렇지 않으면 수정되지 않은 lis를 반환합니다.
        ListNode first = lis;
        while (lis != null) {
            if (lis.next.info.equals(given)) {
                ListNode p = new ListNode(s);
                p.next = lis.next;
                lis.next = p;
                break;
            }

            lis = lis.next;
        }
        return first;
    }

    public static ListNode copy(ListNode lis) {
        //목록 lis의 복사본, 즉 lis와 동일한 요소 시퀀스를 포함하지만 새 노드를 사용하는 목록을 반환

        ListNode dummy = new ListNode(null); // Create a dummy node for the new list
        ListNode current = dummy;

        while (lis != null) {
            ListNode newNode = new ListNode(lis.info);
            current.next = newNode;
            current = newNode;
            lis = lis.next;
        }

        return dummy.next;
    }

    public static ListNode invert(ListNode lis) {
        //노드 간의 링크를 반전시켜
        //lis를 수정 하고 반전된 목록에 대한 참조를 반환합니다.
        ListNode pre = null; //반전될 노드를 넣을 곳
        ListNode current = lis; //현재 노드로 초기화

        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        //는 첫 번째 요소를 제외한 모든 요소를 삭제하여 lis를
        //수정하여 얻은 목록을 반환합니다
        ListNode p = new ListNode(null);
        p.next = lis;
        lis = p;
        int count = 0;

        while (p.next != null) {
            if (count != 0) {
                p.next = p.next.next;
            } else {
                p = p.next;
                count++;
            }

        }
        return lis.next;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        //lis lis1 에 lis2 와 일치하는 연속 요소의 하위 시퀀스가 포함되어
        //있는지 확인
        //예를 들어, lis1 의 요소 순서가 ( ABBCDE) 이고 lis2 의 요소 순서가 (BBC) 인 경우 결과는 true 여야 합니다 .
        // 대신, lis1 이 다시 (ABBCDE) 이고 lis2 가 (ABC) 이면 결과는 false 여야 합니다
        if (lis1 == null || lis2 == null) {
            return false;
        }

        ListNode current1 = lis1;
        ListNode current2 = lis2;

        while (current1 != null) {
            if (current1.info.equals(current2.info)) {
                ListNode temp1 = current1;
                ListNode temp2 = current2;

                while (temp1 != null && temp2 != null && temp1.info.equals(temp2.info)) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }

                if (temp2 == null) {
                    return true;
                }
            }

            current1 = current1.next;
        }

        return false;
    }


}
