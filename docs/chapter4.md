MyBatis 的缓存分为 **一级缓存** 和 **二级缓存**，它们的作用是减少数据库查询次数，提高性能。下面用通俗的语言解释它们的区别和作用：

---

### 1. **一级缓存（Local Cache）**
#### 是什么？
- 一级缓存是 **SqlSession 级别的缓存**，也就是同一个 SqlSession 中有效。
- 默认开启，无需额外配置。

#### 怎么工作？
- 当你用同一个 SqlSession 执行相同的查询时，MyBatis 会先从缓存中找结果，如果缓存中有，就直接返回，不再去数据库查询。
- 如果执行了 **增删改** 操作（INSERT、UPDATE、DELETE），缓存会被清空，以确保数据一致性。

#### 举个例子：
```java
SqlSession sqlSession = sqlSessionFactory.openSession();
UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

// 第一次查询，会去数据库查
User user1 = userMapper.findById(1);

// 第二次查询，直接从缓存中拿，不会去数据库
User user2 = userMapper.findById(1);

sqlSession.close();
```
- 这里 `user1` 和 `user2` 是同一个对象，因为第二次查询直接从一级缓存中取了结果。

#### 特点：
- **作用范围小**：只在同一个 SqlSession 中有效。
- **自动失效**：执行增删改操作后，缓存会被清空。
- **默认开启**：无需配置。

---

### 2. **二级缓存（Global Cache）**
#### 是什么？
- 二级缓存是 **Mapper 级别的缓存**，也就是多个 SqlSession 共享的缓存。
- 需要手动开启和配置。

#### 怎么工作？
- 当多个 SqlSession 执行相同的查询时，MyBatis 会先从二级缓存中找结果，如果缓存中有，就直接返回，不再去数据库查询。
- 二级缓存可以跨 SqlSession 共享数据，适合读取频繁、更新少的场景。

#### 举个例子：
```xml
<!-- 在 Mapper XML 中开启二级缓存 -->
<cache/>
```

```java
SqlSession sqlSession1 = sqlSessionFactory.openSession();
UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
User user1 = userMapper1.findById(1); // 第一次查询，会去数据库查
sqlSession1.close();

SqlSession sqlSession2 = sqlSessionFactory.openSession();
UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
User user2 = userMapper2.findById(1); // 第二次查询，直接从二级缓存中拿
sqlSession2.close();
```
- 这里 `user1` 和 `user2` 是同一个对象，因为第二次查询直接从二级缓存中取了结果。

#### 特点：
- **作用范围大**：多个 SqlSession 共享。
- **需要手动开启**：在 Mapper XML 中配置 `<cache/>`。
- **适合读多写少的场景**：如果数据频繁更新，缓存会频繁失效，反而降低性能。

---

### 3. **一级缓存 vs 二级缓存**
| 特性               | 一级缓存                          | 二级缓存                          |
|--------------------|-----------------------------------|-----------------------------------|
| **作用范围**       | 同一个 SqlSession 内有效          | 多个 SqlSession 共享              |
| **默认开启**       | 是                                | 否，需要手动配置                  |
| **缓存级别**       | SqlSession 级别                   | Mapper 级别                       |
| **失效条件**       | 执行增删改操作后失效              | 执行增删改操作后失效              |
| **适用场景**       | 单次会话内的重复查询              | 跨会话的重复查询，读多写少的场景  |

---

### 4. **注意事项**
- **一级缓存**：
  - 如果同一个 SqlSession 中需要查询实时数据，可以通过 `sqlSession.clearCache()` 手动清空缓存。
- **二级缓存**：
  - 如果多个 SqlSession 同时操作同一数据，可能会导致脏读问题，需要谨慎使用。
  - 二级缓存可以配置缓存策略（如 LRU、FIFO）和缓存刷新间隔。

---

### 总结
- **一级缓存**：同一个 SqlSession 内的缓存，默认开启，适合单次会话内的重复查询。
- **二级缓存**：多个 SqlSession 共享的缓存，需要手动开启，适合跨会话的重复查询。
- 根据业务场景选择合适的缓存机制，避免滥用缓存导致数据不一致或性能下降。