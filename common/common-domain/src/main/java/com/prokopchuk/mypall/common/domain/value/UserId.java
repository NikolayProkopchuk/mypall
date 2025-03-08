package com.prokopchuk.mypall.common.domain.value;

public class UserId extends BaseId<Long> {
    public UserId(Long value) {
        super(value);
    }

    public static UserId of(Long value) {
        return new UserId(value);
    }
}
