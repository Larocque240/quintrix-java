package com.quintrix.conversion.dao;

import com.quintrix.conversion.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DAOImplementation implements DAO<Student> {

    private static final Logger log = LoggerFactory.getLogger(DAOImplementation.class);
    private final JdbcTemplate jdbcTemplate;

    RowMapper<Student> rowMapper = (rs, rowNum) -> {
        Student student = new Student();
        student.setStudentId(rs.getInt("studentid"));
        student.setFirstname((rs.getString("firstname")));
        student.setLastname(rs.getString("lastname"));
        student.setMajor(rs.getString("major"));
        return student;
    };

    public DAOImplementation(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> list() {
        String sql = "SELECT studentid, firstname, lastname, major from student";
        return jdbcTemplate.query(sql,rowMapper);
    }


    @Override
    public void create(Student student) {

    }



    @Override
    public Optional<Student> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Student student, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
