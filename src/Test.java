public class Test {
    public static void main(String[] args) {
        Store store = new Store();
        PremiumMember jane = store.getPremiumMembers().get(0);
        System.out.println(jane.getName()+","+jane.getSpent()+", "+jane.getPaymentCardNo());
        jane.setPaymentCardNo(1234567890);
        System.out.println(jane.getPaymentCardNo());
    }
}
