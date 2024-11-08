class pow {
    public double myPow(double x, int n) {
        int k = (n > 0) ? n : n * -1;
        if(x == 1) return 1;
        if(x == -1) {
            if(n % 2 == 0) return 1;
            return -1;
        }
        if(k < 0) return 0;
        double pow = 1;
        for(int i = 0; i < k; i++) {
            pow = pow * x;
        }
        return (n > 0) ? pow : 1 / pow;
    }
}