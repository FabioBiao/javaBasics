# Working with Databases in Java
- JDBC
- Datasource
- Connection Pool
- Flyway and JDBC Template   - flyway creates versions of DB

# Diagram
![diagram](https://user-images.githubusercontent.com/40702606/132997719-73170303-30a6-499b-9c59-4143ba0f8439.png)

# How to get started
- switch to branch `git checkout start`
- watch YouTube video

# Exercise
- Add the ability to edit movies
- Add `actor` table and associate them with movies
You will need to create a new migration called: `V1__ActorTable.sql` and the following sql to create the actor table
```sql
CREATE TABLE actor
(
    id    bigserial primary key,
    name  TEXT NOT NULL,
    movie bigint REFERENCES movie (id),
    unique (name, movie)
);
```

https://www.youtube.com/watch?v=CJjHdchLY9Y