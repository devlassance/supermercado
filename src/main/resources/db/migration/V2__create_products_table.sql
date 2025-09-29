CREATE TABLE products (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    brand VARCHAR(100),
    price DECIMAL(10, 2) NOT NULL,
    promotion_price DECIMAL(10, 2),
    quantity INT NOT NULL,
    is_active BOOLEAN DEFAULT TRUE,
    category_id BIGINT,
    CONSTRAINT fk_products_category
       FOREIGN KEY (category_id) REFERENCES category_products(id)
       ON DELETE SET NULL
       ON UPDATE CASCADE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);