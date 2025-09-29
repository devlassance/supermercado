ALTER TABLE products
MODIFY COLUMN brand_id BIGINT AFTER category_id,
DROP COLUMN brand;