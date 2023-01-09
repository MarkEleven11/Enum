public enum Load_Capacity {
    N1(0, 3.5f),
    N2(3.5f, 12f),
    N3(12f,100f);

    public float getLow() {
        return low;
    }

    public float getHigh() {
        return high;
    }

    Load_Capacity(float low, float high) {
        this.low = low;
        this.high = high;
    }

    private float low;
    private float high;
}
