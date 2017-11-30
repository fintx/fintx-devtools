-- 在表建成后为所有的表统一添加id 字段，id 作为主键。表中的标记字段做成唯一索引
/**
 * 本条sql 会查询库中没有id字段的表，并生成 alter table 语句
 * 把生成的sql执行之后就会在每一张表中添加id字段
 */
SELECT DISTINCT CONCAT('ALTER TABLE   ', table_name, '  ADD id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ',';' )
FROM information_schema.TABLES
WHERE table_name IN (
    SELECT TABLE_NAME FROM information_schema.`TABLES` tb
    WHERE TABLE_NAME NOT IN (SELECT table_name FROM information_schema.`COLUMNS` col
                  WHERE col.table_schema = tb.table_schema
                    AND col.table_name = tb.table_name
                    AND col.column_name = 'id')
    AND tb.TABLE_SCHEMA = 'core_test'
);
/**
 * 本条sql 会查询库中没有id字段的表，并生成 alter table 语句
 * 把生成的sql执行之后就会在每一张表中添加c_time字段
 */
SELECT DISTINCT CONCAT('ALTER TABLE   ', table_name, '  ADD ctime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间" ',';' )
FROM information_schema.TABLES
WHERE table_name IN (
    SELECT TABLE_NAME FROM information_schema.`TABLES` tb
    WHERE TABLE_NAME NOT IN (SELECT table_name FROM information_schema.`COLUMNS` col
                  WHERE col.table_schema = tb.table_schema
                    AND col.table_name = tb.table_name
                    AND col.column_name = 'ctime')
    AND tb.TABLE_SCHEMA = 'core_test'
);

/**
 * 本条sql 会查询库中没有m_time字段的表，并生成 alter table 语句
 * 把生成的sql执行之后就会在每一张表中添加m_time字段
 */
SELECT DISTINCT CONCAT('ALTER TABLE   ', table_name, '  ADD mtime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT "更新时间" ',';' )
FROM information_schema.TABLES
WHERE table_name IN (
    SELECT TABLE_NAME FROM information_schema.`TABLES` tb
    WHERE TABLE_NAME NOT IN (SELECT table_name FROM information_schema.`COLUMNS` col
                  WHERE col.table_schema = tb.table_schema
                    AND col.table_name = tb.table_name
                    AND col.column_name = 'mtime')
    AND tb.TABLE_SCHEMA = 'core_test'
);

