package com.bosonit.trainning.examenChuchi.registry;

public interface ServiceRegistry {
    public <T> AdapterService<T> getService(String serviceName);
}
