package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Roles;
@Repository
public interface RoleRepository extends JpaRepository<Roles, Long>{

}
