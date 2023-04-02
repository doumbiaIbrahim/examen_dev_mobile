package sn.esmt.OffreEmploye.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.OffreEmploye.entities.CvEntities;

@Repository

public interface CvRepository extends JpaRepository<CvEntities, Integer> {

    CvEntities findById(int id);

    CvEntities findByEmailAndAdresse(String email, String adresse);
}
