package nadiatests;

import org.mockito.internal.matchers.Or;

public class DPPrivateMethod {
    public class orderManager {
        private int orderID = 0;
        private int getNextID() {
            return ++orderID;
        }
    }
}
