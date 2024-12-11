public class DeliveryOrder {
    private DeliveryType inPedestrian;
    private IsFragile isFragile;
    private IsCold isCold;

    public DeliveryOrder(DeliveryType inPedestrian, IsFragile isFragile, IsCold isCold) {
        this.inPedestrian = inPedestrian;
        this.isFragile = isFragile;
        this.isCold = isCold;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "inPedestrian=" + inPedestrian +
                ", isFragile=" + isFragile +
                ", isCold=" + isCold +
                '}';
    }
}
