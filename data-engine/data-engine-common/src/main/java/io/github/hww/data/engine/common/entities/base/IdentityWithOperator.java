package io.github.hww.data.engine.common.entities.base;


import lombok.Data;


@Data
public abstract class IdentityWithOperator extends Identity {
    private String createdBy;
    private String updatedBy;
}
