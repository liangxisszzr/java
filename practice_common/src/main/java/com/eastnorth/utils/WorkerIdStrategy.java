package com.eastnorth.utils;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
