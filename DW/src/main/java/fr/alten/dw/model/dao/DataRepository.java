package fr.alten.dw.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.alten.dw.model.beans.Ae;


public interface DataRepository extends JpaRepository<Ae,Long> {

}
