package door;

public class Door {
    private boolean isOpen = false;

    public void open(String str) {
        if (str.equals("開けゴマ！")) {
            isOpen = true;
        } else {
                        isOpen = false;
            System.out.println("違います。");
        }
    }

    public void close() {
        isOpen = false;
    }

    // getter
    public boolean isOpen() {
        return isOpen;
    }

}
