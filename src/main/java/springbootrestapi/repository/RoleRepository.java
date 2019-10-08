package springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootrestapi.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}