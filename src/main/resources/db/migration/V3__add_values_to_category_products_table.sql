
-- Categorias de nível superior
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active) VALUES
  (NULL, 'Hortifruti', 'hortifruti', 1, TRUE),
  (NULL, 'Carnes', 'carnes', 2, TRUE),
  (NULL, 'Peixes e Frutos do Mar', 'peixes-frutos-do-mar', 3, TRUE),
  (NULL, 'Laticínios e Frios', 'laticinios-frios', 4, TRUE),
  (NULL, 'Padaria e Confeitaria', 'padaria-confeitaria', 5, TRUE),
  (NULL, 'Bebidas', 'bebidas', 6, TRUE),
  (NULL, 'Mercearia', 'mercearia', 7, TRUE),
  (NULL, 'Limpeza', 'limpeza', 8, TRUE),
  (NULL, 'Higiene e Beleza', 'higiene-beleza', 9, TRUE),
  (NULL, 'Congelados', 'congelados', 10, TRUE),
  (NULL, 'Descartáveis e Utilidades', 'descartaveis-utilidades', 11, TRUE),
  (NULL, 'Pet Shop', 'pet-shop', 12, TRUE),
  (NULL, 'Bebê', 'bebe', 13, TRUE);

-- Hortifruti
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Frutas' AS name, 'frutas' AS slug, 1 AS sort_order UNION ALL
  SELECT 'Legumes', 'legumes', 2 UNION ALL
  SELECT 'Verduras', 'verduras', 3 UNION ALL
  SELECT 'Orgânicos', 'organicos', 4
) v ON c.name = 'Hortifruti';

-- Carnes
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Bovina' AS name, 'bovina' AS slug, 1 AS sort_order UNION ALL
  SELECT 'Suína', 'suina', 2 UNION ALL
  SELECT 'Aves', 'aves', 3 UNION ALL
  SELECT 'Moídas e Processadas', 'moidas-processadas', 4
) v ON c.name = 'Carnes';

-- Peixes e Frutos do Mar
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Peixes' AS name, 'peixes' AS slug, 1 AS sort_order UNION ALL
  SELECT 'Frutos do Mar', 'frutos-do-mar', 2 UNION ALL
  SELECT 'Defumados e Salgados', 'defumados-salgados', 3
) v ON c.name = 'Peixes e Frutos do Mar';

-- Laticínios e Frios
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Leites' AS name, 'leites' AS slug, 1 AS sort_order UNION ALL
  SELECT 'Iogurtes', 'iogurtes', 2 UNION ALL
  SELECT 'Queijos', 'queijos', 3 UNION ALL
  SELECT 'Manteiga e Margarina', 'manteiga-margarina', 4 UNION ALL
  SELECT 'Requeijão e Cream Cheese', 'requeijao-cream-cheese', 5 UNION ALL
  SELECT 'Frios e Embutidos', 'frios-embutidos', 6
) v ON c.name = 'Laticínios e Frios';

-- Padaria e Confeitaria
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Pães' AS name, 'paes' AS slug, 1 AS sort_order UNION ALL
  SELECT 'Bolos e Tortas', 'bolos-tortas', 2 UNION ALL
  SELECT 'Biscoitos e Bolachas', 'biscoitos-bolachas', 3 UNION ALL
  SELECT 'Massas Frescas', 'massas-frescas', 4
) v ON c.name = 'Padaria e Confeitaria';

-- Bebidas
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Água' AS name, 'agua' AS slug, 1 AS sort_order UNION ALL
  SELECT 'Refrigerantes', 'refrigerantes', 2 UNION ALL
  SELECT 'Sucos', 'sucos', 3 UNION ALL
  SELECT 'Isotônicos e Energéticos', 'isotonicos-energeticos', 4 UNION ALL
  SELECT 'Cervejas', 'cervejas', 5 UNION ALL
  SELECT 'Vinhos', 'vinhos', 6 UNION ALL
  SELECT 'Destilados', 'destilados', 7
) v ON c.name = 'Bebidas';

-- Mercearia
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Arroz', 'arroz', 1 UNION ALL
  SELECT 'Feijão', 'feijao', 2 UNION ALL
  SELECT 'Massas', 'massas', 3 UNION ALL
  SELECT 'Farinhas', 'farinhas', 4 UNION ALL
  SELECT 'Óleos e Azeites', 'oleos-azeites', 5 UNION ALL
  SELECT 'Molhos e Condimentos', 'molhos-condimentos', 6 UNION ALL
  SELECT 'Enlatados e Conservas', 'enlatados-conservas', 7 UNION ALL
  SELECT 'Açúcar e Adoçantes', 'acucar-adoçantes', 8 UNION ALL
  SELECT 'Cafés', 'cafes', 9 UNION ALL
  SELECT 'Chás', 'chas', 10 UNION ALL
  SELECT 'Cereais e Matinais', 'cereais-matinais', 11
) v(name, slug, sort_order) ON c.name = 'Mercearia';

-- Limpeza
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Lava Roupas', 'lava-roupas', 1 UNION ALL
  SELECT 'Amaciantes', 'amaciantes', 2 UNION ALL
  SELECT 'Alvejantes', 'alvejantes', 3 UNION ALL
  SELECT 'Limpadores Multiuso', 'limpadores-multiuso', 4 UNION ALL
  SELECT 'Desinfetantes', 'desinfetantes', 5 UNION ALL
  SELECT 'Detergentes', 'detergentes', 6 UNION ALL
  SELECT 'Esponjas e Acessórios', 'esponjas-acessorios', 7 UNION ALL
  SELECT 'Sacos de Lixo', 'sacos-de-lixo', 8
) v(name, slug, sort_order) ON c.name = 'Limpeza';

-- Higiene e Beleza
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Sabonetes', 'sabonetes', 1 UNION ALL
  SELECT 'Shampoos e Condicionadores', 'shampoos-condicionadores', 2 UNION ALL
  SELECT 'Desodorantes', 'desodorantes', 3 UNION ALL
  SELECT 'Creme Dental e Bucal', 'creme-dental-bucal', 4 UNION ALL
  SELECT 'Cuidados com a Pele', 'cuidados-pele', 5 UNION ALL
  SELECT 'Barba e Depilação', 'barba-depilacao', 6
) v(name, slug, sort_order) ON c.name = 'Higiene e Beleza';

-- Congelados
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Carnes Congeladas', 'carnes-congeladas', 1 UNION ALL
  SELECT 'Legumes Congelados', 'legumes-congelados', 2 UNION ALL
  SELECT 'Pizzas e Pratos Prontos', 'pizzas-pratos-prontos', 3 UNION ALL
  SELECT 'Sorvetes e Sobremesas', 'sorvetes-sobremesas', 4
) v(name, slug, sort_order) ON c.name = 'Congelados';

-- Descartáveis e Utilidades
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Copos e Pratos Descartáveis', 'copos-pratos-descartaveis', 1 UNION ALL
  SELECT 'Guardanapos e Toalhas', 'guardanapos-toalhas', 2 UNION ALL
  SELECT 'Alumínio e Filme PVC', 'aluminio-filme-pvc', 3 UNION ALL
  SELECT 'Velas e Fósforos', 'velas-fosforos', 4
) v(name, slug, sort_order) ON c.name = 'Descartáveis e Utilidades';

-- Pet Shop
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Ração para Cães', 'racao-caes', 1 UNION ALL
  SELECT 'Ração para Gatos', 'racao-gatos', 2 UNION ALL
  SELECT 'Areia e Higiene', 'areia-higiene', 3 UNION ALL
  SELECT 'Petiscos e Acessórios', 'petiscos-acessorios', 4
) v(name, slug, sort_order) ON c.name = 'Pet Shop';

-- Bebê
INSERT INTO category_products (parent_id, name, slug, sort_order, is_active)
SELECT c.id, v.name, v.slug, v.sort_order, TRUE
FROM category_products c
JOIN (
  SELECT 'Fraldas', 'fraldas', 1 UNION ALL
  SELECT 'Lenços Umedecidos', 'lencos-umedecidos', 2 UNION ALL
  SELECT 'Papinhas', 'papinhas', 3 UNION ALL
  SELECT 'Higiene do Bebê', 'higiene-bebe', 4
) v(name, slug, sort_order) ON c.name = 'Bebê';
