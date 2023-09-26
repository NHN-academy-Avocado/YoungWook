package 연습3;

public class OrderedLinkedList {
    int value;
    OrderedLinkedList next;

    public OrderedLinkedList(int value) {
        this.value = value;
    }

    // 1. 목록이 실제로 주문되었는지 확인
    public boolean isOrdered() {
        if (next == null) {
            return true; // 기본 사례: 더 이상 요소가 없으므로 주문되었다고 간주
        }
        return value <= next.value && next.isOrdered();
    }

    // 2. 주어진 요소를 찾고 삭제 (재귀적 구현)
    public OrderedLinkedList delete(int element) {
        if (value == element) {
            return next; // 현재 요소를 삭제하고 다음 요소를 반환
        } else if (next != null) {
            next = next.delete(element); // 다음 요소에서 재귀적으로 삭제를 시도
        }
        return this; // 현재 요소를 그대로 반환
    }

    // 3. 새로운 요소를 삽입하고 목록의 순서를 유지 (재귀적 구현)
    public void insert(int element) {
        if (element <= value) {
            OrderedLinkedList newNode = new OrderedLinkedList(element);
            newNode.next = this;
            this.value = element;
        } else if (next != null) {
            next.insert(element); // 다음 요소에서 재귀적으로 삽입을 시도
        } else {
            next = new OrderedLinkedList(element); // 끝에 삽입
        }
    }

    // 4. 두 정렬된 목록을 병합 (재귀적 구현)
    public static OrderedLinkedList merge(OrderedLinkedList list1, OrderedLinkedList list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.value < list2.value) {
            list1.next = merge(list1.next, list2);
            return list1;
        } else {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    // 5. 두 목록의 요소를 재사용하여 병합 (반복적 구현)
    public static OrderedLinkedList mergeInPlace(OrderedLinkedList list1, OrderedLinkedList list2) {
        OrderedLinkedList dummy = new OrderedLinkedList(0);
        OrderedLinkedList current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // 6. 두 목록을 교차시켜 새로운 순서 목록 생성 (재귀적 구현)
    public static OrderedLinkedList interleave(OrderedLinkedList list1, OrderedLinkedList list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        OrderedLinkedList merged = new OrderedLinkedList(list1.value);
        merged.next = interleave(list2, list1.next);

        return merged;
    }

    // 재귀적으로 목록을 출력하는 메서드 (도움말 메서드)
    public void print() {
        System.out.print(value + " ");
        if (next != null) {
            next.print();
        }
    }
}
