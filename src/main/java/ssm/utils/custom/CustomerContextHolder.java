package ssm.utils.custom;

public class CustomerContextHolder {

    public static final String DATA_SOURCE_A = "readerDataSource";
    public static final String DATA_SOURCE_B = "writerDataSource";
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }
    public static String getCustomerType() {
        return contextHolder.get();
    }
    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
