package com.tsien.mall.pojo;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public class Category {
    private Integer id;

    private Integer parentId;

    private String name;

    private Boolean status;

    private Integer sortOrder;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Category() {
    }

    public Category(Integer id, Integer parentId, String name, Boolean status, Integer sortOrder, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.sortOrder = sortOrder;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(parentId, category.parentId) &&
                Objects.equals(name, category.name) &&
                Objects.equals(status, category.status) &&
                Objects.equals(sortOrder, category.sortOrder) &&
                Objects.equals(createTime, category.createTime) &&
                Objects.equals(updateTime, category.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, name, status, sortOrder, createTime, updateTime);
    }
}