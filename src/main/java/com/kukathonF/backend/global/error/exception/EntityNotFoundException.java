package com.kukathonF.backend.global.error.exception;

import com.kukathonF.backend.global.error.ErrorCode;

public class EntityNotFoundException extends BusinessException {
    public EntityNotFoundException() {
        super(ErrorCode.ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
