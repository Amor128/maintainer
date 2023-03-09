package com.ermao.dm.dao;

import com.ermao.dm.dao.entity.Schema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ermao
 * Date: 2023/3/9 0:55
 */
@Repository
public interface SchemaRepository extends CrudRepository<Schema, Long> {
}
