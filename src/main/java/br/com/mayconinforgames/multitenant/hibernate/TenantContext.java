package br.com.mayconinforgames.multitenant.hibernate;

public class TenantContext {

    private static final String DEFAULT_TENANT = "tenant01";
    private static final ThreadLocal<String> currentTenant = ThreadLocal.withInitial(() -> DEFAULT_TENANT);

    public static void setCurrentTenant(String tenant) {
        currentTenant.set(tenant);
    }

    public static String getDefaultTenant() {
        return currentTenant.get();
    }

    public static void clear() {
        currentTenant.remove();
    }

}
