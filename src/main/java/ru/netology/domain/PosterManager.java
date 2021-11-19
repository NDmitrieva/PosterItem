package ru.netology.domain;

public class PosterManager {
    private PosterItem[] items = new PosterItem[15];
    private int countLast = 10;


    public PosterManager(int countLast) {
        this.countLast = countLast;
    }

    public PosterManager() {
    }

    public void add(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        System.arraycopy(items,0,tmp,0,items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }



    public PosterItem[] getCountLast() {
        int resultLength;
        if (countLast < items.length){
            resultLength = countLast;
        }
        else {
            resultLength = items.length;
        }
        PosterItem[] result = new PosterItem[resultLength];
         for (int i = 0; i < result.length; i++){
             int index = items.length - i - 1;
             result[i] = items[index];
         }
         return result;
    }

}
