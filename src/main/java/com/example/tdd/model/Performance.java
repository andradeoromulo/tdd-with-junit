package com.example.tdd.model;

import java.math.BigDecimal;

public enum Performance {
    LOW {
        @Override
        public BigDecimal getAdjustmentPercent() {
            return new BigDecimal(("0.05"));
        }
    },
    AVERAGE {
        @Override
        public BigDecimal getAdjustmentPercent() {
            return new BigDecimal(("0.15"));
        }
    },
    HIGH {
        @Override
        public BigDecimal getAdjustmentPercent() {
            return new BigDecimal(("0.20"));
        }
    };

    public abstract BigDecimal getAdjustmentPercent();
}
