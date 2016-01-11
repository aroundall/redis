package org.amuji.web;

import org.amuji.domain.dto.BizException;

/**
 * Roy Yang
 * 7/29/15
 */
public class RestException extends BizException {
    public RestException() {
    }

    public RestException(String message) {
        super(message);
    }
}
