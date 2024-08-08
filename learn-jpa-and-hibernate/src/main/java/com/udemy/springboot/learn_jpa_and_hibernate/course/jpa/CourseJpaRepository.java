package com.udemy.springboot.learn_jpa_and_hibernate.course.jpa;

import com.udemy.springboot.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext//Instead of @AutoWired, we can write this
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }
    public void deleteById(long id){
        Course course=entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}
