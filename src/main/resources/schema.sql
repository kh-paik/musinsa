DROP TABLE IF EXISTS TB_CAT_SUB;
DROP TABLE IF EXISTS TB_CAT_META;

CREATE TABLE TB_CAT_META
(
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(30)
);

CREATE TABLE TB_CAT_SUB
(
    category_id INT,
    sub_category_id INT AUTO_INCREMENT,
    sub_category_name VARCHAR(30),
    CONSTRAINT tb_cat_sub_pk PRIMARY KEY (category_id, sub_category_id),
    CONSTRAINT tb_cat_sub_fk FOREIGN KEY (category_id) REFERENCES TB_CAT_META (category_id) ON DELETE CASCADE
);
