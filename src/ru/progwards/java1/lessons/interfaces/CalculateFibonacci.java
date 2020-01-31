package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    public static void main(String[] args) {
        int i = fiboNumber(29);
        clearLastFibo();
    }

    private static CacheInfo lastFibo;

    public static CacheInfo setLastFibo(CacheInfo lastFibo) {
        CalculateFibonacci.lastFibo = lastFibo;
        return lastFibo;
    }

    public static int fiboNumber(int n) {
        if (n == getLastFibo().n) {
            return getLastFibo().fibo;
        }
        int n0 = 1;int n1 = 1;
        int n2 = 0;
        for(int i = 3; i <= n; i++){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        if (n == 1 || n == 2) {
            CacheInfo cacheInfo = new CacheInfo();
            cacheInfo.n = n;
            cacheInfo.fibo = 1;
            lastFibo = cacheInfo;
            return 1;
        } else {
            CacheInfo cacheInfo = new CacheInfo();
            cacheInfo.n = n;
            cacheInfo.fibo = n2;
            lastFibo = cacheInfo;
            return n2;
        }
    }

    public static class CacheInfo {
        public int n;
        public int fibo;
    }

    public static CacheInfo getLastFibo() {
        if (lastFibo == null) {
            lastFibo = new CacheInfo();
        }
        return lastFibo;
    }

    public static void clearLastFibo() {
        CacheInfo lastFCacheInfo = setLastFibo(lastFibo);
        lastFCacheInfo = null;
    }
}

