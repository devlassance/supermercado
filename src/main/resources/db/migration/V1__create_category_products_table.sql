CREATE TABLE category_products (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    parent_id BIGINT NULL,
    name VARCHAR(255) NOT NULL,
    slug VARCHAR(255) NOT NULL UNIQUE,
    sort_order INT NOT NULL DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_categories_parent
       FOREIGN KEY (parent_id) REFERENCES category_products(id)
       ON DELETE RESTRICT
       ON UPDATE CASCADE,
       CONSTRAINT ux_categories_parent_name UNIQUE (parent_id, name),
       CONSTRAINT ux_categories_parent_slug UNIQUE (parent_id, slug)
);