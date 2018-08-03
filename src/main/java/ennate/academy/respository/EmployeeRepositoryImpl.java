package ennate.academy.respository;

import ennate.academy.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Employee> findAll() {
		TypedQuery<Employee> query = em.createNamedQuery("Employee.findAll", Employee.class);
		return query.getResultList();
    }


    public Employee findOne(String id) {
        return em.find(Employee.class, id);
        //you can set parameter by using query.setParameter("paramEmail", email);
    }


    public Employee create(Employee emp){

        em.persist(emp);
        return emp;
    }
}
