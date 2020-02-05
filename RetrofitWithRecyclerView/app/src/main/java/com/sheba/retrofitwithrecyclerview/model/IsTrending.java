package com.sheba.retrofitwithrecyclerview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IsTrending {
    @SerializedName("last_week_order_count")
    @Expose
    private Integer lastWeekOrderCount;

    public Integer getLastWeekOrderCount() {
        return lastWeekOrderCount;
    }

    public void setLastWeekOrderCount(Integer lastWeekOrderCount) {
        this.lastWeekOrderCount = lastWeekOrderCount;
    }
}
