package com.supermercado.api.categoryProduct.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "category_products")
public class CategoryProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", insertable = false, updatable = false)
    private CategoryProduct parentId;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 255, unique = true)
    private String slug;

    @Column(nullable = false, name = "sort_order")
    private Integer sortOrder = 0;

    @Column(name = "is_active")
    private Boolean isActive = Boolean.TRUE;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "parentId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CategoryProduct> children = new ArrayList<>();

    public CategoryProduct() {}

    public CategoryProduct(CategoryProduct parentId, String name, String slug, Integer sortOrder, Boolean isActive) {
        this.parentId = parentId;
        this.name = name;
        this.slug = slug;
        this.sortOrder = sortOrder;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryProduct getParentId() {
        return parentId;
    }

    public void setParentId(CategoryProduct parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryProduct that = (CategoryProduct) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public String toString() {
        return "CategoryProduct{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", sortOrder=" + sortOrder +
                ", isActive=" + isActive +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
