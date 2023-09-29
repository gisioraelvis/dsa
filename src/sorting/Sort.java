package sorting;

public class Sort {
    private int[] items;

    Sort(int[] items) {
        this.items = items;
    }

    public void swap(int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public void bubble() {
        for (int i = 0; i < items.length; i++) {
            for (int j = 1; j < items.length; j++) {
                if (items[j] < items[j - 1]) {
                    swap(j, j - 1);
                }
            }
        }
    }

    public void selection() {
        for (int i = 0; i < items.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j] < items[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }
    }

    public void insertion() {
        for (int i = 1; i < items.length; i++) {
            int currentItem = items[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && currentItem < items[previousIndex]) {
                items[previousIndex + 1] = items[previousIndex];
                previousIndex--;
            }
            items[previousIndex + 1] = currentItem;
        }
    }


}
