package com.kaankaplan.LiteraryLink.core.util.results;

public abstract class DataResult<T> extends Result {

    private final T data;

    public DataResult(T data, boolean isSuccess) {
        super(isSuccess);
        this.data = data;
    }

    public DataResult(T data, boolean isSuccess, String message) {
        super(isSuccess, message);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
