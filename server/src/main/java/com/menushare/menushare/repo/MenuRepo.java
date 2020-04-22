package com.menushare.menushare.repo;

import com.menushare.menushare.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepo extends JpaRepository<Menu, Long> {

}
